package com.cjw.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyInterceptor implements MethodInterceptor {
    private Object object;

    public MyInterceptor(Object object) {
        this.object = object;
    }

    public MyInterceptor() {
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib动态代理开始。。。");
//        Object invoke = method.invoke(this.object, objects);
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib动态代理开始。。。");

        return invoke;
    }
}
