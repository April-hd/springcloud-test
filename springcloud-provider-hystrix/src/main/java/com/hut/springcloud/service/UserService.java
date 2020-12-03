package com.hut.springcloud.service;

import com.hut.springcloud.mapper.UserMapper;
import com.hut.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    @SuppressWarnings("all")
    private UserMapper userMapper;

    public List<User> findList(){
        return userMapper.findList();
    }

}
