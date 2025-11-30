package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //-------> This is XML Configuration

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1= context.getBean("alien",Alien.class);
////        obj1.setAge(22);
//        System.out.println(obj1.getAge());
//        obj1.complier();
//
////        Alien obj2= (Alien) context.getBean("alien");
////        System.out.println(obj2.age);
////        obj2.complier();
////        Desktop desktop = context.getBean(Desktop.class);



        //-------> This is Java Base configuration

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop desktop = context.getBean(Desktop.class);
//        desktop.code();
//
//        Desktop desktop1 = context.getBean(Desktop.class);
//        desktop1.code();


        Alien obj1= context.getBean(Alien.class);
//        obj1.setAge(22);
        System.out.println(obj1.getAge());
        obj1.complier();


    }
}
