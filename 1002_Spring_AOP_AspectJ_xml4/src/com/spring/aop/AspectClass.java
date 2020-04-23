package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectClass 
{
	 public void myadvice(ProceedingJoinPoint jp) throws Throwable
	 {   
		 Object obj;
		 System.out.println("Additional concern @Around Advice-->  start");
				
		 obj = jp.proceed();
		 
		 System.out.println("Additional concern @Around Advice-->  end");
		
	 }

}
