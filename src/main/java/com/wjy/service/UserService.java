package com.wjy.service;

import com.wjy.mojo.User;

public interface UserService {

    public String createUser(String username,Integer age) ;

    public User getUser(Integer id);

}