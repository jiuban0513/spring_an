package com.an.jdbc.dao;

import com.an.jdbc.entity.Student;

import javax.sql.DataSource;
import java.util.List;

public interface StudentDao {

    public void setDataSource(DataSource dataSource);

    public Integer insertStudent(String name,Integer age);

    public Integer deleteStudent(Integer id);

    public Integer updateStudent(Integer id,String name);

    public Student selectStudent(Integer id);

    public List<Student> selectList();

}
