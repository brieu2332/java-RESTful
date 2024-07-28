package com.example.santanderdevweek.controller;

import com.example.santanderdevweek.data.local.Transaction;
import com.example.santanderdevweek.data.local.User;
import com.example.santanderdevweek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.createUser(user);
    }

    @PostMapping("/transaction")
    public void performTransaction(@RequestBody Transaction transaction) {
        userService.performTransaction(transaction);
    }
}
