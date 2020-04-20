package com.spring.aop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

//this class is Aspect , heart of spring AOP

public class BeforeAdvisor implements MethodBeforeAdvice
{
    
	@Override
	public void before(Method method,Object args[],Object target) throws Throwable  //Advice
	{
		System.out.println("Additional concern before Actual Logic");
	}

}
