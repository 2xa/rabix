package io.github.twoxa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class RabixApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RabixApp.class, args);
    }
}