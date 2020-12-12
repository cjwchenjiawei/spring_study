package com.cjw.po;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Data
@Component
public class User {
    @Value("1")
    private int id;
    @Value("熊猫")
    private String username;
    @Autowired
//    @Qualifier("date")
    private Date birthday;


    public User() {
    }

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }
}
