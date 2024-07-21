package com.volley.controller;

import com.volley.entities.User;
import com.volley.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public void insertUser(@RequestBody User user) {
        userService.createNewUser(user);
    }

    @GetMapping("/list")
    public List<User> findAllUsers() {
        return userService.getAllUsers();
    }
}
