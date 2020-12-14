import com.cjw.config.ApplicationConfig;
import com.cjw.dao.UserMapper;
import com.cjw.po.User;
import com.cjw.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class ServiceTest {
    final Logger logger = LoggerFactory.getLogger(getClass());
    AnnotationConfigApplicationContext context;
    private UserService userService;


    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        userService = context.getBean("userService",UserService.class);
    }

    @Test
    public void test(){
        User user = new User();
        user.setUsername("chenjinnan");
        user.setNickname("陈近南");
        user.setPassword("123456");
        user.setRegTime(new Date());
        boolean flag = userService.insertUser(user);
        logger.info("是否成功：{}",flag);
        logger.info("最新的id是:{}",user.getId());
    }
}
