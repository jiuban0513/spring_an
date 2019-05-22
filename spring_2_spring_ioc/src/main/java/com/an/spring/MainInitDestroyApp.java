package com.an.spring;

import com.an.spring.entity.HelloMessage;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInitDestroyApp {
    /**
     * init-method 属性指定一个方法，在实例化 bean 时，立即调用该方法。
     * 同样，destroy-method 指定一个方法，只有从容器中移除 bean 之后，才能调用该方法。
     * @param args
     */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("InitDestroyBean.xml");
        HelloMessage helloMessage = (HelloMessage) context.getBean("helloWorld");
        helloMessage.getMessage();
        context.registerShutdownHook();
    }
}
