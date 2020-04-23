package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AroundAdvisor 
{
    
	@Pointcut("execution(* Logic.*())")
	public void point() {}
	
	@Around("point()")
	public Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable
	{   
		Object obj;
		System.out.println("Additional Concern start");
		
		obj = jp.proceed();
		
		System.out.println("Additional Concern complete");
		
		return obj;
	}
	

}
