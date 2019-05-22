package com.an.aop.common;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {

    @Pointcut("execution(* com.an.aop.entity..*.*(..))")
    private void selectAll(){}

    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("Going to setup student profile（执行方法之前）.");
    }

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("Student profile has been setup（执行方法之后）.");
    }

    @AfterReturning(pointcut = "selectAll()",returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning（返回）:" + retVal.toString() );
    }

    @AfterThrowing(pointcut = "selectAll()",throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception（异常）: " + ex.toString());
    }
}
