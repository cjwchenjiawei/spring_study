package com.cjw.controller;

import com.cjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService us;

    public void list(){
        System.out.println("UserController的list");
        us.list();
    }
}
