package com.leafych.bestideaserver.dao;

import com.leafych.bestideaserver.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> queryAllUsers();
}
