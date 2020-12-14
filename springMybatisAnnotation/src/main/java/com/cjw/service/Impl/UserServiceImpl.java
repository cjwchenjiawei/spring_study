package com.cjw.service.Impl;

import com.cjw.dao.UserMapper;
import com.cjw.po.User;
import com.cjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.findAll();
    }

    @Override
    @Transactional
    public boolean insertUser(User user) {
        int n = userMapper.insertSelective(user);
        return n>0?true:false;
    }
}
