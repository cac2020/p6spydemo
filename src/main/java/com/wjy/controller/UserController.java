package com.wjy.controller;
import com.wjy.mojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wjy.service.UserService;


@RestController
public class UserController {

    @Autowired
    public UserService userService;


    @RequestMapping("/createUser")
    public String createUser(String name, Integer age) {
        userService.createUser(name, age);
        return "success";
    }

    @RequestMapping("/getUser")
    public User getUser(Integer id) {
        return userService.getUser(id);
    }

}