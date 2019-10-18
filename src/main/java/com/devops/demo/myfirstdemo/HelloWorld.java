package com.devops.demo.myfirstdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public void print(){
        System.out.println("Hello World");
    }
}
