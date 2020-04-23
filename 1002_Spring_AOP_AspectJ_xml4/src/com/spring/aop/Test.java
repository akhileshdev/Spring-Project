package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Logic log = (Logic)context.getBean("logicBean");
		
		System.out.println("\ncalling msg() method");
		log.msg();		
		
		System.out.println("\ncalling display() method");
		log.display();

	}

}
