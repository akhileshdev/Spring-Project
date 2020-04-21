package com.spring.aop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvisor implements AfterReturningAdvice    //Aspect
{   
	@Override
	public void afterReturning(Object returnValue,Method method,Object args[],Object Target) throws Throwable
	{		
		System.out.println("Aditional concern after some logic");		
		
	}
	
}
