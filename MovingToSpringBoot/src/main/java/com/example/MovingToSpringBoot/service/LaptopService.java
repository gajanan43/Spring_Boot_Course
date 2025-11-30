package com.example.MovingToSpringBoot.service;

import com.example.MovingToSpringBoot.repo.LaptopRepository;
import com.example.MovingToSpringBoot.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
}
