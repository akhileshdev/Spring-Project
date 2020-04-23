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
		
		
		System.out.println("\ncalling validate method/joinpoint");
		try {
			log.validate(15);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1);
		}
		
		
		System.out.println("\ncalling validate method/joinpoint");
		try {
			log.validate(23);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
	}

}
