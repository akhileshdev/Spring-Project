package com.spring.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FriendDao fd = (FriendDao)context.getBean("fdao");
		
		List<Friend> list = new ArrayList<Friend>();
		
		list = fd.displayFriend();
		
		System.out.println("\nDisplaying Friend :-");
		for(Friend fr : list)
			System.out.println(fr);
		
	}

}
