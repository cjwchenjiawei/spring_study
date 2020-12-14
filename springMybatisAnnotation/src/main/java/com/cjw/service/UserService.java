package com.cjw.service;

import com.cjw.po.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    boolean insertUser(User user);
}
