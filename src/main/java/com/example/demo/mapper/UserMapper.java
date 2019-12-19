package com.example.demo.mapper;

import com.example.demo.common.BaseMapper;
import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LXJ
 * @description
 * @date 2019/12/18 14:54
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    List<User> findAllUser();
}
