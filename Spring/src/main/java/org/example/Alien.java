package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    @Value("25")
    private int age;
    private Computer comp;

    public Alien(){
        System.out.println("Alien Default constructor called");
    }

//    @ConstructorProperties({"age","lap"})
//    public Alien(int age, Laptop lap) {
//        this.age = age;
//        this.lap = lap;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }
    @Autowired
//    @Qualifier("desktop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void complier() {
//        System.out.println("Coding");
        comp.code();
    }

}
