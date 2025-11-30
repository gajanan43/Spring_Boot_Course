package com.example.MovingToSpringBoot;

import com.example.MovingToSpringBoot.model.Alien;
import com.example.MovingToSpringBoot.model.Laptop;
import com.example.MovingToSpringBoot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovingToSpringBootApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(MovingToSpringBootApplication.class, args);

        LaptopService service= context.getBean(LaptopService.class);

        Laptop lap=context.getBean(Laptop.class);
        service.addLaptop(lap);


	}

}
