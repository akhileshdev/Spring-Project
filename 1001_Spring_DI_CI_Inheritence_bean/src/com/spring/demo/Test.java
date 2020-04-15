package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = (Employee)context.getBean("emp2");  //calling bean emp1 implicitly without dependent object 
		                                                   //calling bean emp2 explicitly here 
		
		emp.displayInfo();

	}

}
