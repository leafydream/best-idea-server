package com.leafych.bestideaserver.service.impl;

import com.leafych.bestideaserver.dao.UserMapper;
import com.leafych.bestideaserver.entity.User;
import com.leafych.bestideaserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> queryAllUsers() {
        return userMapper.queryAllUsers();
    }
}
