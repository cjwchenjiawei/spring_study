import com.cjw.config.ApplicationConfig;
import com.cjw.po.User;
import com.cjw.service.Impl.UserServiceImpl;
import com.cjw.service.UserService;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

public class Test {

    final Logger logger = LoggerFactory.getLogger(getClass());
    AnnotationConfigApplicationContext context;

    @Before
    public void init(){
        context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }

    @org.junit.Test
    public void testTx(){
        User user = new User();
        user.setUsername("weichunhua");
        user.setPassword("123456");
        user.setNickname("韦春花");
        user.setRegTime(new Date());
        UserService userService = context.getBean("userService", UserService.class);
        boolean flag = userService.insertUser(user);
        logger.info("{}",flag);
    }
}
