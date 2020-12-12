package test;

import com.cjw.config.ApplicationContext;
import com.cjw.dao.UserDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void testAopAnnotation(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);
        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.add();
    }
}
