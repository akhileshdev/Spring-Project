package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ThrowsAdvisor 
{
     @AfterThrowing(
    		 
    		 pointcut = "execution(* Validator.*(..))",
    		 throwing  = "error" )
      
     public void myadvice(JoinPoint jp,Throwable error)
     {
    	 System.out.println("Additional Concern");
    	 System.out.println("Method Signature : "+jp.getSignature());
    	 System.out.println("Error : "+error);
    	 
    	 System.out.println("End of additional concern/throwing Advice");
    	 
     }

}
