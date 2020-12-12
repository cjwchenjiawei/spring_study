package com.cjw.po;

import lombok.Data;

import java.util.*;

@Data
public class User {
    private int id;
    private String username;
//    private Date birthday;
//    private Dept dept;
//    private String [] arrs;
//    private List<String> list;
//    private Set<Dept> set;
//    private Map<String,String> map;
//    private Properties prop;

    public User() {
    }

    public User(int id, String username, Date birthday, Dept dept, String[] arrs, List<String> list, Set<Dept> set, Map<String, String> map, Properties prop) {
        this.id = id;
        this.username = username;
//        this.birthday = birthday;
//        this.dept = dept;
//        this.arrs = arrs;
//        this.list = list;
//        this.set = set;
//        this.map = map;
//        this.prop = prop;
    }
}
