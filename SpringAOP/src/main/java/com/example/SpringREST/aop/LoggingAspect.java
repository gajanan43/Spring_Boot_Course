package com.example.SpringREST.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.example.SpringREST.service.JobService.getJob(..)) || execution(* com.example.SpringREST.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp) {
        log.info("logMethodCall " + jp.getSignature().getName());
    }

    @After("execution(* com.example.SpringREST.service.JobService.getJob(..)) || execution(* com.example.SpringREST.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint jp) {
        log.info("logMethodExecuted " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.example.SpringREST.service.JobService.getJob(..)) || execution(* com.example.SpringREST.service.JobService.updateJob(..))")
    public void logMethodCrashed(JoinPoint jp) {
        log.info("logMethodCrashed " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.SpringREST.service.JobService.getJob(..)) || execution(* com.example.SpringREST.service.JobService.updateJob(..))")
    public void logMethodExecutedSuccess(JoinPoint jp) {
        log.info("logMethodExecutedSuccess " + jp.getSignature().getName());
    }
}
