package com.cjw.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

    public String add(){
//        int i = 5/0;
        System.out.println("UserDao.add");
        return "abcdef";
    }
}
