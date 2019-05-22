package com.an.spring;

import com.an.spring.entity.HelloMessage;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.ResourceBundle;

public class MainBeansApp {
    public static void main(String[] args) {
//        beanFactory();//XmlBeanFactory读取bean
//        fileSystemXmlApplicationContext();//fileSystemXmlApplicationContext读取bean
//        classPathXmlApplicationContext();//classPathXmlApplicationContext读取bean
        properties();//ResourceBundle读取properties
    }

    public static void beanFactory(){
        //1.创建应用程序的上下文（处理创建并初始化所有的对象）
        XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("Beans.xml"));//不推荐使用XmlBeanFactory,推荐使用ApplicationContext
        //2.根据bean的id获取信息（使用已创建的上下文的 getBean() 方法来获得所需的 bean）
        HelloMessage helloMessage = (HelloMessage) context.getBean("hellomessage");
        helloMessage.getMessage();
    }

    public static void fileSystemXmlApplicationContext(){
        //1.创建应用程序的上下文（处理创建并初始化所有的对象）
        //FileSystemXmlApplicationContext:需要提供给构造器 XML 文件的完整路径。
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\workspace\\ideaworkspace\\spring_an\\spring_2_spring_bean\\src\\main\\sources\\Beans.xml");
        //2.根据bean的id获取信息（使用已创建的上下文的 getBean() 方法来获得所需的 bean）
        HelloMessage helloMessage = (HelloMessage) context.getBean("hellomessage");
        helloMessage.getMessage();
    }

    public static void classPathXmlApplicationContext(){
        //1.创建应用程序的上下文（处理创建并初始化所有的对象）
        //ClassPathXmlApplicationContext:不需要提供 XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //2.根据bean的id获取信息（使用已创建的上下文的 getBean() 方法来获得所需的 bean）
        HelloMessage helloMessage = (HelloMessage) context.getBean("hellomessage");
        helloMessage.getMessage();
    }

    public static void properties(){
//        ApplicationContext context = new ResourceB("custom.properties");
////        context.getApplicationName("an.custom.name");
//        String applicationName = context.getApplicationName();
//        System.out.println(applicationName);
        ResourceBundle resource = ResourceBundle.getBundle("custom");
        String name = resource.getString("an.custom.name");
        String password = resource.getString("an.custom.password");
        System.out.println(name+"  "+password);
    }
}
