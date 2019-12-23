package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LXJ
 * @description
 * @date 2019/12/18 14:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public PageInfo<User> findAllUser(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = this.userMapper.selectAll();
        return new PageInfo<>(list);
    }

    @Override
    public User getById(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
