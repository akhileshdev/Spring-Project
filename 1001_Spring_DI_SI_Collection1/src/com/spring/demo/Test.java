package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //ApplicationContext is IOC container here
		
		Question question = (Question)context.getBean("quest");  //fetching bean with name "ques" in applicationContext.xml file
		
		question.displayInfo();

	}

}
