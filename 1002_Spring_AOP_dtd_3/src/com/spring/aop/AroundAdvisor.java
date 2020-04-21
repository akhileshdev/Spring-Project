package com.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor
{
    
	@Override
	public Object invoke(MethodInvocation meth) throws Throwable
	{  
		Object ob;
		System.out.println("\nAdditional concern before logic");
		
		ob = meth.proceed();
		
		System.out.println("Additional concern after logic/joinpoint");
		
		return ob;		
		
	}	
	
}
