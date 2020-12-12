package com.cjw.proxy;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public void list(){
        System.out.println("userDao的list");
    }
}
