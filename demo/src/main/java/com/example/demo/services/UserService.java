package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.repository.UserRepository;
import com.example.demo.model.User;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        // Guarda el usuario en la base de datos
        User savedUser = userRepository.save(user);

        return savedUser;
    }

    public User findUserById(String userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User findUserByUsername(String usernameString) {
        return userRepository.findByUsername(usernameString);
    }
}
