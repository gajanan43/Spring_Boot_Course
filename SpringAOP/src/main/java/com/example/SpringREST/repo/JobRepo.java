package com.example.SpringREST.repo;


import com.example.SpringREST.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Repository
//public class JobRepo {
//
//    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//            new JobPost(1, "Java Developer", "TCS", "Pune", "8 ", "Backend role"),
//            new JobPost(2, "Web Developer", "Infosys", "Mumbai", "6 ", "Frontend role")
//    ));
//
//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//
//    public void addJob(JobPost jobPost){
//        jobs.add(jobPost);
//    }
//
//    public JobPost getJob(int postId) {
//        for(JobPost job : jobs){
//            if(job.getId()==postId){
//                return job;
//            }
//        }
//        return null;
//    }
//
//    public void updateJob(JobPost updatedJob) {
//        for (JobPost job : jobs) {
//            if (job.getId() == updatedJob.getId()) {
//                job.setTitle(updatedJob.getTitle());
//                job.setCompany(updatedJob.getCompany());
//                job.setLocation(updatedJob.getLocation());
//                job.setSalary(updatedJob.getSalary());
//                job.setDescription(updatedJob.getDescription());
//            }
//        }
//    }
//
//
//    public void deleteJob(int postId) {
//        for(JobPost job2 : jobs){
//            if(job2.getId()==postId){
//                jobs.remove(job2);
//            }
//        }
//    }
//}

@Repository
public  interface JobRepo  extends JpaRepository<JobPost,Integer> {
    List<JobPost> findByCompanyContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String company, String description);

}