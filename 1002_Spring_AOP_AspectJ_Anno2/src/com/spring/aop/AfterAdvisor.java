package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect                       //Aspect class
public class AfterAdvisor 
{
    @Pointcut("execution(* Logic.*(..))")    
    public void point() {}               //pointcut name

    
	@After("point()")         //Annotation for AfterAdvice  applying pointcut on afteradvice
    public void myadvice(JoinPoint jp)   //Advice method
    {
    	System.out.println("Aditional Concern after method call");
    }    

}
