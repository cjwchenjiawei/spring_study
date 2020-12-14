import com.cjw.config.ApplicationConfig;
import com.cjw.dao.UserMapper;
import com.cjw.po.User;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.List;

public class Test {
   final Logger logger = LoggerFactory.getLogger(getClass());
    AnnotationConfigApplicationContext context;
    private UserMapper userMapper;


    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        userMapper = context.getBean("userMapper",UserMapper.class);
    }

    @org.junit.Test
    public void test(){
        User user = new User();
        user.setUsername("chenjinnan");
        user.setNickname("陈近南");
        user.setPassword("123456");
        user.setRegTime(new Date());
        int insert = userMapper.insert(user);
        logger.info("{}",insert);
    }
}
