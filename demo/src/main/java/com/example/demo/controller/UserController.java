package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // Validate user data
        // Implement validation logic similar to the GraphQL code
        System.out.println("Vamos a crear el user " + user.getName());
        userService.saveUser(user);
        // Save the user to the database
        // userService.findUserById(userId);
        return ResponseEntity.ok("User created successfully");
    }

    @GetMapping("/user/{usernameString}")
    public ResponseEntity<User> getUser(@PathVariable String usernameString) {
        // Validate user data
        // Implement validation logic similar to the GraphQL code
        System.out.println("Ha entrado en el endpoint " + usernameString);
        User user = userService.findUserByUsername(usernameString);
        System.out.println(user.getAddress().getCountry());
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}