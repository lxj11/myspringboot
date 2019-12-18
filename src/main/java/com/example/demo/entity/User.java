package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LXJ
 * @description
 * @date 2019/12/18 14:51
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer gender;
    private Date createDate;
    private String userPhone;
}
