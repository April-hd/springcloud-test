package com.hut.springcloud.mapper;

import com.hut.springcloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findList();

}
