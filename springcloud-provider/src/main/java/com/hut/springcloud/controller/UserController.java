package com.hut.springcloud.controller;

import com.hut.springcloud.Service.UserService;
import com.hut.springcloud.mapper.UserMapper;
import com.hut.springcloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    @SuppressWarnings("all")
    private UserService userService;

    @GetMapping("findList")
    public List<User> findList() {
        return userService.findList();
    }

}
