package com.an.jdbc;

import com.an.jdbc.dao.StudentJDBCTemplate;
import com.an.jdbc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainJDBCApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("JdbcBean.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
//        insert(studentJDBCTemplate);
//        delete(studentJDBCTemplate);
//        update(studentJDBCTemplate);
//        select(studentJDBCTemplate);
        selectList(studentJDBCTemplate);
    }

    public static void insert(StudentJDBCTemplate studentJDBCTemplate){
        System.out.println("添加数据:");
        Integer an = studentJDBCTemplate.insertStudent("an", 21);
        Integer he = studentJDBCTemplate.insertStudent("he", 22);
        Integer ding = studentJDBCTemplate.insertStudent("ding", 23);
        System.out.println(an+" "+he+" "+ding);
    }
    public static void delete(StudentJDBCTemplate studentJDBCTemplate){
        System.out.println("删除数据：");
        Integer integer = studentJDBCTemplate.deleteStudent(6);
        System.out.println(integer);
    }
    public static void update(StudentJDBCTemplate studentJDBCTemplate){
        System.out.println("更改数据：");
        Integer newan = studentJDBCTemplate.updateStudent(5, "an");
        System.out.println(newan);
    }
    public static void select(StudentJDBCTemplate studentJDBCTemplate){
        System.out.println("查单条：");
        Student student = studentJDBCTemplate.selectStudent(1);
        System.out.println(student.toString());
    }
    public static void selectList(StudentJDBCTemplate studentJDBCTemplate){
        System.out.println("查集合：");
        List<Student> students = studentJDBCTemplate.selectList();
        for (Student s : students){
            System.out.print("id:"+s.getId()+"|");
            System.out.print("name:"+s.getName()+"|");
            System.out.println("age:"+s.getAge());
        }
    }
}
