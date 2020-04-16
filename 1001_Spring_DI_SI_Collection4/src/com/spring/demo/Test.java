package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Question question = (Question)context.getBean("ques");
		
		question.displayInfo();

	}

}
