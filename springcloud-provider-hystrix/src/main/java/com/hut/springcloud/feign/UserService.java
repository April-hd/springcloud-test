package com.hut.springcloud.feign;

import com.hut.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "SPRINGCLOUD-PROVIDER")
public interface UserService {

    @RequestMapping("/user/findList")
    List<User> findList();

}
