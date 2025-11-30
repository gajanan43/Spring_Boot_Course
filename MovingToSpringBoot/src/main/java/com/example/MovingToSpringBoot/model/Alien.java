package com.example.MovingToSpringBoot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("22")
    private int age;
    Computer comp;

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
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        comp.complier();
    }
}
