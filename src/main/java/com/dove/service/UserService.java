package com.dove.service;

import com.dove.entity.User;

import java.util.Map;

public interface UserService {
    public Map<Object,Object> login(User user);

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);
}
