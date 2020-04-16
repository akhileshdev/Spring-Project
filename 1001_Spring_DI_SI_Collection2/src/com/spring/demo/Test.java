package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Question question = (Question)app.getBean("quest");
		
		question.displayInfo();
		

	}

}
