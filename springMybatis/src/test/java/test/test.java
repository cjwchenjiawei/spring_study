package test;

import com.cjw.dao.UserDao;
import com.cjw.po.User;
import com.cjw.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Date;


public class test {
    final Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void testDataSource(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource)context.getBean("dataSource");
        logger.info("{}",dataSource);
    }

    @Test
    public void testMapper(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.getAll();
    }

    @Test
    public void testTx(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);
        User user = new User();
        user.setUsername("weixiaobao");
        user.setPassword("123456");
        user.setNickname("韦小宝");
        user.setRegTime(new Date());

        userServiceImpl.insertUser(user);
    }
}
