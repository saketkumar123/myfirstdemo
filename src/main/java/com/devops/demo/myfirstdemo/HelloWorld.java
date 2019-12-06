package com.devops.demo.myfirstdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
	
	public static final String INDEX = "index";

    @GetMapping("/hello")
    public void print(){
        System.out.println("Hello World");
    }
    
    @GetMapping("/")
    public String welcome(ModelMap model) {
    	return INDEX;
    }
}
