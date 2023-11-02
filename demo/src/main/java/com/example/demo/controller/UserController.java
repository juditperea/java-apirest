package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // Permite solicitudes solo desde http://localhost:5173
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        // Lógica para guardar el usuario en la base de datos
        User savedUser = userService.saveUser(user);
        logger.info("Usuario creado con éxito: {}", savedUser.getUsername());
        return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @GetMapping("/user/{usernameString}")
    public ResponseEntity<User> getUser(@PathVariable String usernameString) {
        System.out.println("Ha entrado en el endpoint " + usernameString);
        User user = userService.findUserByUsername(usernameString);
        System.out.println(user.getAddress().getCountry());
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
