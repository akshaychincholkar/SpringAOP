package com.game.spring.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.game.spring.springaop.data.*.*(..))")
    public void dataLayerExecution() {   }
    @Pointcut("execution(* com.game.spring.springaop.business.*.*(..))")
    public void businessLayerExecution() {   }
    //Pointcut for all layer execution
    @Pointcut("dataLayerExecution() || businessLayerExecution()")
    public void allLayerExecution(){}

    //Pointcut for bean execution
    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){}

    //Pointcut for within
    //no return type * is required for within
    @Pointcut("within(com.game.spring.springaop.data..*)")
    public void dataLayerExecutionWithWithin(){}

    @Pointcut("@annotation(com.game.spring.springaop.aspect.TrackTime)")
    public void timeTrack(){}
}
