package com.leafych.bestideaserver.services.impl;

import com.leafych.bestideaserver.dao.UserMapper;
import com.leafych.bestideaserver.entity.User;
import com.leafych.bestideaserver.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> queryAllUsers() {
        return userMapper.queryAllUsers();
    }
}
