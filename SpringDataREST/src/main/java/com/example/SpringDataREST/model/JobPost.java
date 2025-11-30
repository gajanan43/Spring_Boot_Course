package com.example.SpringDataREST.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class JobPost {
    @Id
    private int id;
    private String title;
    private String company;
    private String location;
    private String salary;
    private String description;

}
