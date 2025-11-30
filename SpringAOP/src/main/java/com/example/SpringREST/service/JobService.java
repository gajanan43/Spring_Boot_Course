package com.example.SpringREST.service;


import com.example.SpringREST.model.JobPost;
import com.example.SpringREST.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//
//@Service
//public class JobSerivce {
//
//    @Autowired
//    private JobRepo repo;
//
//    public void addJob(JobPost jobPost){
//        repo.addJob(jobPost);
//    }
//
//    public List<JobPost> getAllJobs(){
//        return repo.getAllJobs();
//    }
//
//    public JobPost getJob(int postId) {
//        return repo.getJob(postId);
//    }
//
//    public void updateJob(JobPost jobPost) {
//        repo.updateJob(jobPost);
//    }
//
//    public void deleteJob(int postId) {
//        repo.deleteJob(postId);
//    }
//}

@Service
public class JobService {
    @Autowired
    private JobRepo  jobRepo;

    public void addJob(JobPost jobPost){
        jobRepo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepo.findAll();
    }

    public JobPost getJob(int postId) {
        return jobRepo.findById(postId).get();
    }

    public void updateJob(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "TCS", "Pune", "8 ", "Backend role"),
            new JobPost(2, "Web Developer", "Infosys", "Mumbai", "6 ", "Frontend role")
        ));

        jobRepo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return  jobRepo.findByCompanyContainingIgnoreCaseOrDescriptionContainingIgnoreCase(keyword, keyword);
    }
}