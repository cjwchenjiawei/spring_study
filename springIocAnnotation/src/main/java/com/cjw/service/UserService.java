package com.cjw.service;

import com.cjw.proxy.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao ud;

    public void list(){
        System.out.println("UserService的list");
        ud.list();
    }
}
