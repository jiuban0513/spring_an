package com.an.jdbc.dao;

import com.an.jdbc.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate implements StudentDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Integer insertStudent(String name,Integer age) {
        String SQL = "insert into student(name,age) values(?,?)";
        int update = jdbcTemplate.update(SQL, name, age);
        System.out.println("添加成功:"+update+"  "+name);
        return update;
    }

    @Override
    public Integer deleteStudent(Integer id) {
        String SQL = "delete from student where id = ?";
        int update = jdbcTemplate.update(SQL, id);
        System.out.println("删除成功："+update+id);
        return update;
    }

    @Override
    public Integer updateStudent(Integer id,String name) {
        String SQL = "update student set name = ? where id = ?";
        int update = jdbcTemplate.update(SQL, name,id);
        System.out.println("更改成功："+update+name);
        return update;
    }

    @Override
    public Student selectStudent(Integer id) {
        String SQL = "select * from student where id = ?";
        Student student = jdbcTemplate.queryForObject(SQL, new Object[]{id}, new StudentMapper());
        System.out.println("查询单条："+student.toString());
        return student;
    }

    @Override
    public List<Student> selectList() {
        String SQL = "select * from student";
        List<Student> query = jdbcTemplate.query(SQL, new StudentMapper());
        System.out.println("查询集合："+query.size());
        return query;
    }
}
