package com.an.spring.parent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainParentApp {
        /**
         *
         * @param args
         */
        public static void main(String[] args) {
                ApplicationContext context = new ClassPathXmlApplicationContext("ParentBean.xml");
                HelloMessage2 helloMessage2 = (HelloMessage2) context.getBean("helloWorld");
                helloMessage2.getMessage1();
                helloMessage2.getMessage2();
                HelloIndia helloIndia = (HelloIndia)context.getBean("helloIndia");
                helloIndia.getMessage1();
                helloIndia.getMessage2();
                helloIndia.getMessage3();
        }
}
