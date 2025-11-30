package com.example.SpringJDBC2;

import com.example.SpringJDBC2.model.Student;
import com.example.SpringJDBC2.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbc2Application {

	public static void main(String[] args) {
       ApplicationContext context= SpringApplication.run(SpringJdbc2Application.class, args);
        Student s=context.getBean(Student.class);
        s.setId(1);
        s.setFirstName("Gajanan");
        s.setLastName("Narwade");

        StudentService ss=context.getBean(StudentService.class);

        ss.addStudent(s);

        List<Student> students=ss.getStudetns();
        System.out.println(students);
	}

}
