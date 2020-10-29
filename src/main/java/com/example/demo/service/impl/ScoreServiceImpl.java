package com.example.demo.service.impl;

import com.example.demo.MyException;
import com.example.demo.entity.Score;
import com.example.demo.entity.User;
import com.example.demo.mapper.ScoreMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.ScoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author liuxiaojing
 * @since 2020-09-18 4:02 下午
 */
@Service
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreMapper scoreMapper;


    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    public int insert(Score score) {
        this.scoreMapper.insert(score);
        System.out.println(1 / 0);


        return 0;
    }
}
