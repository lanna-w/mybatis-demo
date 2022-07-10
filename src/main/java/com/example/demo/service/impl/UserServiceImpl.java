package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        // 为了方便先创建一条数据
        User user = User.builder()
                .id(111)
                .username("helloworld")
                .password("still helloworld")
                .build();
        save(user);
        return userMapper.findAll();
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

}
