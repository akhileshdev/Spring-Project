package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		FriendDao fr = (FriendDao)context.getBean("fdao");       
		List<Friend> list = fr.displayAll();
		
		System.out.println("\nDisplay all Friend :-");		
		for(Friend f : list)
			System.out.println(f.getId()+" "+f.getName()+" "+f.getAge());
				
	}

}
