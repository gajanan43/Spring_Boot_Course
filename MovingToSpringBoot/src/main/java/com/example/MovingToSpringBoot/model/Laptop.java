package com.example.MovingToSpringBoot.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public void complier(){
        System.out.println("Laptop complier");
    }
}
