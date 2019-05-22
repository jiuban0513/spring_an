package com.an.di.setget;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSetGetApp {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("SetgetBean.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("InnerBean.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
