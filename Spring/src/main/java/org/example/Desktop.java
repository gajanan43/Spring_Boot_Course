package org.example;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements  Computer{
    public Desktop(){
        System.out.println("Desktop constructor called");
    }
    @Override
    public void code()
    {
        System.out.println("Code running on Desktop");
    }
}
