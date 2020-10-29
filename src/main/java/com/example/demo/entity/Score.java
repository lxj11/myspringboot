package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author liuxiaojing
 * @since 2020-09-18 4:30 下午
 */
@Data
@Table(name = "tb_score")
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "score")
    private Integer score;

}
