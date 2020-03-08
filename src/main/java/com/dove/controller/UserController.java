package com.dove.controller;

import com.dove.entity.User;
import com.dove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{
    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    public boolean register(User user) {
        int flag = userService.addUser(user);
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }
}
