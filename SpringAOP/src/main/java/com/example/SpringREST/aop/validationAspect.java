package com.example.SpringREST.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class validationAspect {
    private static final Logger log = LoggerFactory.getLogger(validationAspect.class);

    @Around("execution(* com.example.SpringREST.service.JobService.getJob(..)) && args(postId)")
    public Object validationAndUpdate(ProceedingJoinPoint pjp, int postId) throws Throwable {

        if(postId<0){
            postId = -postId;
        }

        Object obj=pjp.proceed(new Object[]{postId});

        return obj;
    }
}
