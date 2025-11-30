package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Laptop implements Computer {

    public Laptop() {
        System.out.println("Laptop constructor called");
    }

    @Override
    public void code(){
        System.out.println("Code running on laptop");
    }
}
