package com.cjw.dao;

import com.cjw.po.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    public List<User> getAll();
}
