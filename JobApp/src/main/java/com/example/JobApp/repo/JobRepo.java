package com.example.JobApp.repo;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "TCS", "Pune", "8 ", "Backend role"),
            new JobPost(2, "Web Developer", "Infosys", "Mumbai", "6 ", "Frontend role")
    ));

    public List<JobPost> getAllJobs(){
            return jobs;
    }

    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
    }
}
