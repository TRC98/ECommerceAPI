package com.MyShop.ECommerceAPI.service.impl;

import com.MyShop.ECommerceAPI.entity.User;
import com.MyShop.ECommerceAPI.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        user.setId(nextId++);
        users.add(user);
    }
}
