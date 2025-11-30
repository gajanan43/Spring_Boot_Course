package com.example.MovingToSpringBoot.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void complier(){
        System.out.println("Desktop complier");
    }
}
