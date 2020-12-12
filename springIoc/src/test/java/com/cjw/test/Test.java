package com.cjw.test;

import com.cjw.po.Dept;
import com.cjw.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    final Logger logger = LoggerFactory.getLogger(getClass());

    @org.junit.Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        Dept dept1 = context.getBean("dept", Dept.class);
        Dept dept2 = context.getBean("dept", Dept.class);
        System.out.println(dept2==dept1);
        logger.info("用户信息：{}",user);
    }
}
