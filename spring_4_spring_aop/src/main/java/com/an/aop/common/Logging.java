package com.an.aop.common;

public class Logging {
    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */
    public void beforeAdvice(){
        System.out.println("Going to setup student profile（执行方法之前）.");
    }
    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */
    public void afterAdvice(){
        System.out.println("Student profile has been setup（执行方法之后）.");
    }
    /**
     * This is the method which I would like to execute
     * when any method returns.
     */
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning（返回）:" + retVal.toString() );
    }
    /**
     * This is the method which I would like to execute
     * if there is an exception raised.
     */
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception（异常）: " + ex.toString());
    }

    public void aroundAdvice(){
        System.out.println("环绕输出。。");
    }
}
