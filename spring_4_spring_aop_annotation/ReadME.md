
#课外知识点：[Spring框架的AOP](https://www.w3cschool.cn/wkspring/izae1h9w.html)

### - 此小项目是学习string的AOP（面向切面）功能：
#### -- 此小项目是基于注解方式运行的
#### -- 此小项目的功能是在某个方法前后去添加日志（也就是自定义）的方法

- 1.Spring 中基于 AOP 的 @AspectJ

- 2.bean配置文件中要使用：
~~~java
<aop:aspectj-autoproxy/>
~~~

- 3.jar包需要添加以下三个（版本可以变化）：
~~~java
        <!-- https://mvnrepository.com/artifact/org.aspectj/aspectjrt -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjrt</artifactId>
            <version>1.9.3</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.9.3</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/aopalliance/aopalliance -->
        <dependency>
            <groupId>aopalliance</groupId>
            <artifactId>aopalliance</artifactId>
            <version>1.0</version>
        </dependency>
~~~


