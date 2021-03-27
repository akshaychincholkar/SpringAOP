package com.game.spring.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class AfterAopAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @AfterReturning(value = "execution(* com.game.spring.springaop.business.*.*(..))",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result) {
        logger.info("method {} is returning with value {}",joinPoint,result);
    }
    @AfterThrowing(value = "execution(* com.game.spring.springaop.business.*.*(..))",throwing = "myException")
    public void afterThrowing(JoinPoint joinPoint,Exception myException) {
        logger.info("method {} thrown an Exception: {}",joinPoint,myException);
    }
    @After(value = "execution(* com.game.spring.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("after completing {}",joinPoint);
    }
}
