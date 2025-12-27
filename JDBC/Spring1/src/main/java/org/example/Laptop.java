package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop called");
    }

    @Override
    public void compile() {
        System.out.println("Laptop code compiled");
    }
}
