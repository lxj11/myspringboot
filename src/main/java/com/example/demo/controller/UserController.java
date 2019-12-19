package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LXJ
 * @description
 * @date 2019/12/18 14:59
 */
@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/all")
    public PageInfo<User> getAllUser(@RequestParam(value = "pageNum")Integer pageNum,
                                 @RequestParam(value = "pageSize")Integer pageSize){
        log.info("获取所有的用户pageNum={},pageSize={}",pageNum,pageSize);
        PageInfo<User> list = this.userService.findAllUser(pageNum,pageSize);
        return list;
    }

}
