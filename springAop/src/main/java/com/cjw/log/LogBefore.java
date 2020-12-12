package com.cjw.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("方法执行之前打印日志!");
    }
}
