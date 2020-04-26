package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FriendDao fr = (FriendDao)context.getBean("fdao");
		
		int status = fr.deleteFriend(new Friend(901,"Santosh Kumar",32));
		
		System.out.println("\nStatus : "+status);
		
			

	}

}
