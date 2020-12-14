package com.cjw.service.impl;

import com.cjw.dao.UserDao;
import com.cjw.po.User;
import com.cjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public boolean insertUser(User user) {
        int n = userDao.insertUser(user);
        return n>0?true:false;
    }
}
