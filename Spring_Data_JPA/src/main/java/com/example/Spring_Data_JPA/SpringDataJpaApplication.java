package com.example.Spring_Data_JPA;

import com.example.Spring_Data_JPA.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
	    ApplicationContext context= SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo=context.getBean(StudentRepo.class);
//
//        Student s1=context.getBean(Student.class);
        Student s2=context.getBean(Student.class);
        Student s3=context.getBean(Student.class);
//
//
//        s1.setFirstName("Gajanan");
//        s1.setAge(22);
//
//
        s2.setId(2);
        s2.setFirstName("Kohli");
        s2.setAge(39);
//
//
//        s3.setFirstName("Rohit");
//        s3.setAge(39);
//
//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

        //Find By Id
//        Optional<Student> student=repo.findById(4);
//        System.out.println(student.orElse(new Student()));

        //Find By Name
//        System.out.println(repo.findByName("Virat"));
        //find greater than
//        System.out.println(repo.findByAgeGreaterThan(20));


        repo.delete(s2);
	}
}
