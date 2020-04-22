package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningAdvisor 
{

	@AfterReturning(
		pointcut = "execution(* Logic.*(..))",
		returning = "result")
	
	public void myadvice(JoinPoint jp,Object result)
	{
		
		System.out.println("Additional Concern AfterReturning Advice");
		
		System.out.println("Method Signature : "+jp.getSignature());		
		System.out.println("Result in Advice : "+result);
		
		System.out.println("End of AfterReturning Advice");
				
	}	

}
