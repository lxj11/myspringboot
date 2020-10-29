package com.example.demo;

import lombok.Getter;

/**
 * @author liuxiaojing
 * @since 2020-09-18 10:40 上午
 */
@Getter
public class MyException extends RuntimeException {

    private String code;

    public MyException(String code,String message){
        super(message);
        this.code = code;
    }


}
