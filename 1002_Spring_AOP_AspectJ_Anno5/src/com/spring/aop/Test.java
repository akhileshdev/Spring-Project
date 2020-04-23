package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Validator valid = (Validator)context.getBean("logicBean");
		
		System.out.println("\ncalling validate...");  
		try 
		{
			valid.validate(15);
		} 
		catch (Exception e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			
			System.out.println(e1);
		}
		
		System.out.println("\ncalling validate Again...");  
		try 
		{
			valid.validate(20);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
