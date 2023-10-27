package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // Validate user data
        // Implement validation logic similar to the GraphQL code

        // Save the user to the database
        userRepository.save(user);

        return ResponseEntity.ok("User created successfully");
    }
}