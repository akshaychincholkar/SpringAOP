package com.game.spring.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * The process of implementing AOP around your method is called WEAVING and the
 * framework is called as the WEAVER.
 */
//AOP
//Configuration
@Aspect //combination of pointcuts and advice
@Configuration
public class UserAccessCheck {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //What kind of method calls I would intercept?
    //execution(* PACKAGE.*.*(..))
    @Before("execution(* com.game.spring.springaop.data.*.*(..))") //point cuts
    public void before(JoinPoint joinPoint) {  //joinpoint - specific execution instance. ex: dao1.retrieveData() - 1 joinpoint/method
        //this block is called advise - What should I do? - complete logic is advise
        //What to do? - Advise
        logger.info("Checking for user access...");
        logger.info("User is allowed execution for :{}",joinPoint);
    }
    //My learning
    /*
    @After("execution(* com.game.spring.springaop.data.*.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of the method: {}",joinPoint);
    }
    @AfterReturning("execution(* com.game.spring.springaop.data.*.*(..))")
    public void afterReturning(JoinPoint joinPoint) {
        logger.info("after *returning* execution of the method: {}",joinPoint);
    }
    @AfterThrowing("execution(* com.game.spring.springaop.data.*.*(..))")
    public void afterThrowing(JoinPoint joinPoint) {
        logger.info("after *throwing* execution of the method: {}",joinPoint);
    }*/
}
