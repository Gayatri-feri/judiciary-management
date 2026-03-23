package com.judiciary.judiciary_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.judiciary.judiciary_management.entity.User;
import com.judiciary.judiciary_management.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // ADD USER (for testing)
    @GetMapping("/add")
    public String addUser() {
        User user = new User();
        user.setName("Ram");
        user.setEmail("ram@gmail.com");
        user.setPassword("1234");
        user.setRole("LAWYER");

        userRepository.save(user);

        return "User Added Successfully!";
    }

    // GET ALL USERS
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}