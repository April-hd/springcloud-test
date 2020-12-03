package com.hut.springcloud.controller;

import com.hut.springcloud.feign.UserService;
import com.hut.springcloud.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    @SuppressWarnings("all")
    private UserService userService;

    @RequestMapping("findList")
    @HystrixCommand(fallbackMethod = "findListHystrix")
    public Map<String, Object> findList() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<User> list = userService.findList();
        map.put("list", list);
        return map;
    }

    public Map<String, Object> findListHystrix() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", "连接超时");
        return map;
    }

}
