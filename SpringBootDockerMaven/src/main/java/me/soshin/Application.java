package me.soshin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

@RestController
class Controller {

    @GetMapping("/")
    public String index() {
        return "Hello from Spring Boot Docker with Maven!";
    }
}
