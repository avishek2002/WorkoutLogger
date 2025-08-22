package com.app.main.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.dto.LoginRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/signin")
    @CrossOrigin(origins = "http://localhost:3000")  // Enable CORS for React dev server
    public ResponseEntity<String> signIn(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        // Dummy authentication logic - replace with your own user service
        if ("user".equals(username) && "password".equals(password)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }

    @PostMapping("/forgotPassword")
    @CrossOrigin(origins = "http://localhost:3000")  // Enable CORS for React dev server
    public ResponseEntity<String> sendEmailPasswordRecovery(@RequestBody SendPasswordChangeEmailRequest sendPasswordChangeEmailRequest) {

        // Dummy authentication logic - replace with your own user service
        if ("user".equals(sendPasswordChangeEmailRequest.getUsername()) && "password".equals(sendPasswordChangeEmailRequest.getEmail())) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
    
}