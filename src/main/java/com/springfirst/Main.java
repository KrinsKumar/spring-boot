package com.springfirst;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        // eSystem.out.println("Hello World!");
    }

    @GetMapping("/")
    public GreetResponse greet() {
        GreetResponse returnType =  new GreetResponse(
            "Hello",
            List.of("jave", "js", "python"),
            new Person("John Doe")
        );
        return returnType;
    }

    record Person(String name) {}

    record GreetResponse(
        String greet,
        List<String> favProgrammingLanguages,
        Person person
    ) {}
}
