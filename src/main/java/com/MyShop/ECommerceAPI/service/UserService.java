package com.MyShop.ECommerceAPI.service;

import com.MyShop.ECommerceAPI.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void addUser(User user);
}
