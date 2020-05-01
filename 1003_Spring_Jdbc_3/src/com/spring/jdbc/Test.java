package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FriendDao fd = (FriendDao)context.getBean("fdao");
		
		Boolean status = fd.saveFriend(new Friend(101,"Kushal Jain",31));
		
		System.out.println("Status : "+status);

	}

}
