package com.example.springboottutorial1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTutorial1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorial1Application.class, args);
    }

    @GetMapping("/say-hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "name")String name) {

        return String.format("Hello%s!", name);

    }
}

