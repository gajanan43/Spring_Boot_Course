package com.example.SpringDataREST.repo;


import com.example.SpringDataREST.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface JobRepo extends JpaRepository<JobPost,Integer> {


}