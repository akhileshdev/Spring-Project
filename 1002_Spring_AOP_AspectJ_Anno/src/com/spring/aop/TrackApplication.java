package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackApplication 
{
	@Pointcut("execution(* Logic.*(..))")    
	public void doSome(){}                 //pointcut name
	
	
    @Before("doSome()")                       
	public void myAdvice(JoinPoint jp)
	{
		
    	System.out.println("Addition Concern before Actual Business Logic");
    	
    	System.out.println("Method Signature : "+jp.getSignature());
    	
	}
	
}
