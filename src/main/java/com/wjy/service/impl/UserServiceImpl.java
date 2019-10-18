package com.wjy.service.impl;

import com.wjy.mojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.wjy.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String createUser(String username, Integer age) {
        jdbcTemplate.update("insert into users values(null,?,?)",username,age);
        return "success";
    }

    @Override
    public User getUser(Integer id) {
        User u = jdbcTemplate.queryForObject("select * from users where id=?",User.class,id);
        return u;
    }

}