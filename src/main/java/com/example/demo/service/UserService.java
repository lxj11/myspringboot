package com.example.demo.service;

import com.example.demo.entity.User;
import com.github.pagehelper.PageInfo;


public interface UserService {
    PageInfo<User> findAllUser(Integer pageNum,Integer pageSize);

    User getById(Integer id);
}
