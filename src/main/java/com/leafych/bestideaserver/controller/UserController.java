package com.leafych.bestideaserver.controller;

import com.leafych.bestideaserver.entity.User;
import com.leafych.bestideaserver.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/")
    public String index() {
        return "hello springboot";
    }

    @GetMapping("/queryAllUsers")
    public List<User> queryAllUsers() {
        return userServices.queryAllUsers();
    }
}
