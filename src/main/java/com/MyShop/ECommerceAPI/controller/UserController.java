package com.MyShop.ECommerceAPI.controller;

import com.MyShop.ECommerceAPI.entity.User;
import com.MyShop.ECommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

    private final UserService userservice;

    @Autowired
    public UserController(UserService userservice){ // dependency injection
        this.userservice=userservice;
    }

    @GetMapping("/getUser")
    public List<User> getUser(){
        return userservice.getUsers();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        userservice.addUser(user);
        return "User Add successfully";
    }
}
