package com.example.SpringREST.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceMonitorAspect {

    private static final Logger log = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* com.example.SpringREST.service.JobService.getJob(..))")
    public Object monitorTime(ProceedingJoinPoint pjp) throws Throwable {
        long start= System.currentTimeMillis();
        Object obj=pjp.proceed();
        long end= System.currentTimeMillis();
        long time=end-start;
        System.out.println("Time taken: "+time+ " ms");

        return obj;
    }
}
