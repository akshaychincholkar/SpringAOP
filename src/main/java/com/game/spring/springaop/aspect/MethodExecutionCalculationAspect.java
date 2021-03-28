package com.game.spring.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Around(value = "com.game.spring.springaop.aspect.CommonJoinPointConfig.timeTrack()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long totalTime = System.currentTimeMillis() - startTime;
        logger.info("Time: method {} executed in {} ms",joinPoint,totalTime);
    }
}
