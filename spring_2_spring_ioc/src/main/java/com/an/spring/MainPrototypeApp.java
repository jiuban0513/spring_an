package com.an.spring;

import com.an.spring.entity.HelloMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPrototypeApp {
    /**
     *测试Prototype作用域
     *
     * Prototype是原型类型，它在我们创建容器的时候并没有实例化，
     * 而是当我们获取bean的时候才会去创建一个对象，而且我们每次获取到的对象都不是同一个对象。
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("PrototypeBean.xml");
        HelloMessage helloWorldA = (HelloMessage) classPathXmlApplicationContext.getBean("helloWorld");
        helloWorldA.setMessage("i am A!");
        helloWorldA.getMessage();
        HelloMessage helloMessageB = (HelloMessage)classPathXmlApplicationContext.getBean("helloWorld");
        helloMessageB.getMessage();
    }
}
