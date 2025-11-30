package com.example.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPost {

    private int id;
    private String title;
    private String company;
    private String location;
    private String salary;
    private String description;

}
