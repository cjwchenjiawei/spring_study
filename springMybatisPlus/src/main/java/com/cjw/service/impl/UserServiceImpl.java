package com.cjw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cjw.po.User;
import com.cjw.dao.UserMapper;
import com.cjw.service.UserService;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public boolean insertUser(User user) {
        int insert = userMapper.insert(user);
        return insert>0?true:false;
    }
}
