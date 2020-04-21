package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Logic obj = (Logic)context.getBean("proxy",Logic.class);  //logic's object is getting proxied
		
		obj.business();
		

	}

}
