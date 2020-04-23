package com.spring.aop;

import org.aspectj.lang.JoinPoint;

public class AspectClass 
{
     public void myadvice(JoinPoint jp,Object result)
     {
    	 System.out.println("Addictional concern @AfterReturning Advice");
    	 
    	 System.out.println("Method Signature : "+jp.getSignature());
    	 System.out.println("Result : "+result);
     }

}
