package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		FriendDao fr = (FriendDao)context.getBean("fdao");
		
		fr.saveFriend(new Friend(301,"Baba Jackson",45));
		
		System.out.println("Successfully added Row !!");

	}

}
