package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    // GET HTTP Method
// http://localhost:8082/hello-world
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
