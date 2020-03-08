package com.dove.service.impl;

import com.dove.dao.UserMapper;
import com.dove.entity.User;
import com.dove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<Object, Object> login(User user) {
        return userMapper.login(user);
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }
}
