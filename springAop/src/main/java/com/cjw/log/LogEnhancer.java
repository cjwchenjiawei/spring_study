package com.cjw.log;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogEnhancer {
    public void log(){
        System.out.println("打印日志");
    }

    public void aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕打印开始");
        joinPoint.proceed();
        System.out.println("环绕打印开始");
    }

    public void exp(Exception e){
        System.out.println("LogEnhancer.exp  异常通知:"+e.getMessage());
    }
}
