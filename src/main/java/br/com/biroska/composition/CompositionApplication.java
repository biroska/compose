package br.com.biroska.composition;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
@SpringBootApplication
public class CompositionApplication {

    @Value("${application.version}")
    private String version;

    public static void main(String[] args) {
        SpringApplication.run(CompositionApplication.class, args);
    }


    @RequestMapping("/")
    String home() {
        return MessageFormat.format("Hello World! {0}", version);
    }

}
