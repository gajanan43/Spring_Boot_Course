package org.example;


import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj=(Alien) context.getBean("alien");
//        System.out.println(obj.getAge());
//        obj.code();

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt=context.getBean("d",Desktop.class);
//        dt.compile();

        Alien alien=context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();


    }
}
