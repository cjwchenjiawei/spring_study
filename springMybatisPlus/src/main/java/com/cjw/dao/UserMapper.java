package com.cjw.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cjw.po.User;
import org.springframework.stereotype.Repository;

@Repository("userMapper")
public interface UserMapper extends BaseMapper<User> {
}