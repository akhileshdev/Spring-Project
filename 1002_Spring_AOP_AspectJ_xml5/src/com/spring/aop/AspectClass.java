package com.spring.aop;

import org.aspectj.lang.JoinPoint;

public class AspectClass 
{
     
	public void myadvice(JoinPoint jp,Throwable error)
	{
		System.out.println("Additional Concern @AfterThrowing Advice ");
		
		System.out.println("Method Signature : "+jp.getSignature());
		
		System.out.println("Exception is "+error);
		System.out.println("End of Throwable Advice");
		
	}

}
