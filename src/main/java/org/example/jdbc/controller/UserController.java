package org.example.jdbc.controller;

import org.example.jdbc.model.User;
import org.example.jdbc.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        return UserRepository.getUser();
    };
}
