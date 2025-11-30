package com.example.SpringJDBC2.repo;

import com.example.SpringJDBC2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;


    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student){
        String sql=" insert into student (id,firstName,lastName) values(?,?,?)";
        int rows=jdbc.update(sql,student.getId(),student.getFirstName(),student.getLastName());
        System.out.println(rows+"effectd");
    }

    public List<Student> findAll() {
       String sql="select * from student";

       return jdbc.query(sql,(rs, rowNum) -> {
           Student student=new Student();
           student.setId(rs.getInt("id"));
           student.setFirstName(rs.getString("firstName"));
           student.setLastName(rs.getString("lastName"));

           return student;
       });
    }
}
