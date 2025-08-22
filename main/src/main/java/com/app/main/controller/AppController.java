package com.app.main.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000") // Allow requests from React dev server
@RestController
public class AppController {

    @GetMapping("/")
    public String welcomePage() {
        return "Welcome to Workout Logger App!";
    }
    
    @GetMapping("/signin")
    public String signIn() {
        return "Enter your credentials..";
    }
    
}
