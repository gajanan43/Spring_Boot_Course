package com.example.SpringREST.controller;


import com.example.SpringREST.model.JobPost;
import com.example.SpringREST.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("/jobPosts")
    public List<JobPost> getJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobPosts/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return service.getJob(postId);
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return service.search(keyword);
    }

    @PostMapping("jobPosts")
    public void addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
    }

    @PutMapping("jobPosts")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return jobPost;
    }

    @DeleteMapping("jobPosts/{postId}")
    public void deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "sucess";
    }
}
