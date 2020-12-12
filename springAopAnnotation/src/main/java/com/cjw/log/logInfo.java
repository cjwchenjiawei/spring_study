package com.cjw.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class logInfo {

    @Pointcut("execution(* com.cjw.dao..*(..))")
    public void pointcut(){}


    @Before("pointcut()")
    public void logBefore(){
        System.out.println("log Before");
    }

    @After("pointcut()")
    public void logAfter(){
        System.out.println("log After");
    }

    @AfterReturning(value = "pointcut()",returning = "returnObject")
    public void logAfterReturning(Object returnObject){
        System.out.println(returnObject);
        System.out.println("log AfterReturning");
    }

    @Around("pointcut()")
    public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("logAround begin");
        joinPoint.proceed();
        joinPoint.getTarget();
        joinPoint.getThis();
        System.out.println("logAround end");
    }

    @AfterThrowing(value = "pointcut()",throwing = "error")
    public void logExp(Exception error){
        System.out.println("发生异常，异常："+error.getMessage());
    }
}
