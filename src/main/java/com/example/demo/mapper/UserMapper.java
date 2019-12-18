package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LXJ
 * @description
 * @date 2019/12/18 14:54
 */
@Mapper
public interface UserMapper {
    List<User> findAllUser();
}
