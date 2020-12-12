import com.cjw.proxy.*;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.objenesis.instantiator.basic.ProxyingInstantiator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class testProxy {

    @Test
    public void testStaticProxy(){
        UserDao userProxy = new UserProxy(new UserDaoImpl());
        userProxy.add();
    }

    @Test
    public void testJdkProxy(){
        UserDao invoke = (UserDao)Proxy.newProxyInstance(UserDao.class.getClassLoader(), new Class[]{UserDao.class} , new MyInvocationHandler(new UserDaoImpl()));
        invoke.add();
    }

    @Test
    public void testCglibProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDaoImpl.class);
        enhancer.setCallback(new MyInterceptor());
//        enhancer.setCallback(new MyInterceptor(new UserDaoImpl()));
        UserDaoImpl invoke = (UserDaoImpl) enhancer.create();
        invoke.add();
    }

}
