package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
	   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //ApplicationContext is IOC container
	   
	   Question ques = (Question)context.getBean("quest"); //searching bean with name 'quest' in XML file
	   
	   ques.displayInfo();

	}

}
