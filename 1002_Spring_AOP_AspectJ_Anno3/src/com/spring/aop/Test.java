package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Logic log = (Logic)context.getBean("logicBean");
		
		System.out.println("\nCalling m() ");
		System.out.println(log.m());
		
		System.out.println("\nCalling k() ");
		System.out.println(log.k());		

	}

}
