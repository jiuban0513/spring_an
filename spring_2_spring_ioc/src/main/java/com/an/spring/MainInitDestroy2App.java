package com.an.spring;

import com.an.spring.entity.HelloMessage;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInitDestroy2App {
    /**
     * init-method 属性指定一个方法，在实例化 bean 时，立即调用该方法。
     * 同样，destroy-method 指定一个方法，只有从容器中移除 bean 之后，才能调用该方法。
     *
     * 如果你有太多具有相同名称的初始化或者销毁方法的 Bean，那么你不需要在每一个 bean 上声明初始化方法和销毁方法。
     * 框架使用 元素中的 default-init-method 和 default-destroy-method 属性提供了灵活地配置这种情况
     * @param args
     */
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("InitDestroyBean.xml");
        HelloMessage helloMessage = (HelloMessage) context.getBean("helloWorld");
        helloMessage.getMessage();
        context.registerShutdownHook();
    }
}
