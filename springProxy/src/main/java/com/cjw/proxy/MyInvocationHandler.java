package com.cjw.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private UserDaoImpl ud;

    public MyInvocationHandler(UserDaoImpl ud) {
        this.ud = ud;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("动态代理开始");
        Object invoke = method.invoke(ud, args);
        System.out.println("动态代理结束");

        return null;
    }
}
