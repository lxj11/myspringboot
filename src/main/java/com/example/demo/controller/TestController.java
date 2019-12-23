package com.example.demo.controller;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author LXJ
 * @description
 * @date 2019/12/20 14:46
 */
public class TestController {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put(null,null);
        System.out.println(map);
        Map<String,String> table = new Hashtable<>();
//        table.put(null,null);
        System.out.println(table);
        Map<String,String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put(null,null);
        System.out.println(concurrentHashMap);
    }
}
