package test;

import com.cjw.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;


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
}
