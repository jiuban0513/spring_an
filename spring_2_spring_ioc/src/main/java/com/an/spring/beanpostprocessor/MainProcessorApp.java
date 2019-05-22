package com.an.spring.beanpostprocessor;

import com.an.spring.entity.HelloMessage;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class MainProcessorApp {
    /**
     * Bean 后置处理器允许在调用初始化方法前后对 Bean 进行额外的处理。
     * BeanPostProcessor 接口定义回调方法，你可以实现该方法来提供自己的实例化逻辑，依赖解析逻辑等。
     * @param args
     */
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("ProcessorBean.xml");
        HelloMessage helloMessage = (HelloMessage)context.getBean("helloWorld");
        helloMessage.getMessage();
        context.registerShutdownHook();
    }
}
