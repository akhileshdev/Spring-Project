package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main(String args[])
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	FriendDao fr = (FriendDao)context.getBean("fdao");
    	
        //int status = fr.deleteFriend(new Friend(401,"Rohan baba",23));
    	
    	
    	Friend f = new Friend();
    	f.setId(101);
        
    	int status = fr.deleteFriend(f); 
    	
        System.out.println("\n\nStatus of Query : "+status);
    	
    }

}
