package com.example.MovingToSpringBoot.repo;

import com.example.MovingToSpringBoot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in DB");
    }

}
