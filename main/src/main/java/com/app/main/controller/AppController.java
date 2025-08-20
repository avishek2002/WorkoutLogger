package com.app.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

    @GetMapping("/")
    public String welcomePage() {
        return "Welcome to Workout Logger App!";
    }
    
}
