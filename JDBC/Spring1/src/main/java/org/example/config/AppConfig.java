package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.rmi.AlreadyBoundException;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    @Qualifier("desktop")
//    public Alien alien(Computer com){
//        Alien obj=new Alien();
//        obj.setAge(21);
//        obj.setCom(com);
//
//        return obj;
//
//    }
//
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }



}
