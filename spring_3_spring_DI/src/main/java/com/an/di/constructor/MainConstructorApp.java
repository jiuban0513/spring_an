package com.an.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConstructorApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorBean.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }
}
