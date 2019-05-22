package com.an.spring;

import com.an.spring.entity.HelloMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSingletonApp {
    /**
     * 测试singleton作用域
     *
     * Singleton是单例类型，就是在创建起容器时就同时自动创建了一个bean的对象，
     * 不管你是否使用，他都存在了，每次获取到的对象都是同一个对象。
     * 注意，Singleton作用域是Spring中的缺省作用域。
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("SingletonBean.xml");
        HelloMessage helloWorldA = (HelloMessage) classPathXmlApplicationContext.getBean("helloWorld");
        helloWorldA.setMessage("i am A!");
        helloWorldA.getMessage();
        HelloMessage helloMessageB = (HelloMessage)classPathXmlApplicationContext.getBean("helloWorld");
        helloMessageB.getMessage();
    }
}
