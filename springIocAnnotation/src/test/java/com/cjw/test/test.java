package com.cjw.test;

import com.cjw.controller.UserController;
import com.cjw.po.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    final Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.list();
        User user = context.getBean("user", User.class);
        logger.info("{}",user);

    }
}
