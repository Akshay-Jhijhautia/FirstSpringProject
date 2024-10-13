package com.akshay.firstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String getHome(){
        return "Welcome to SpringBoot";
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "<b>Hello World<b>";
    }

    @GetMapping("/test")
    public String test(){
        return "Testing";
    }
}
