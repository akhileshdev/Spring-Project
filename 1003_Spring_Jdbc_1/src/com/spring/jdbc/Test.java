package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FriendDao fr = (FriendDao)context.getBean("friendDao");
		
		int status = fr.saveFriend(new Friend(901,"Santosh Kumar",32));
		
		System.out.println("Status : "+status);
		
			

	}

}
