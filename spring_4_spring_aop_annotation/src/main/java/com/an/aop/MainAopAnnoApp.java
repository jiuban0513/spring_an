package com.an.aop;

import com.an.aop.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAopAnnoApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationBean.xml");
        Student student = (Student) context.getBean("student");
        student.getAge();
        student.getName();
        student.printThrowException();
    }
}
