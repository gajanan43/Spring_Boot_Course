package com.example.JobApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JobAppApplication {

	public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(JobAppApplication.class, args);
	}

}
