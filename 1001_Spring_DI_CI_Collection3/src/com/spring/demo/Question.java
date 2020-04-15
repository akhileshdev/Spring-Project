package com.spring.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question 
{
    private int id;
    private String name;    
    private Map<String,String> answer;
        
	public Question(int id,String name,Map<String,String> answer) 
	{
		this.id  = id;
		this.name = name;
		this.answer = answer;		
	}
	
	public void displayInfo()
	{		
		System.out.println("\nQuestion : [ ID : "+id+" Ques : "+name+" ]");
		
		Set<Entry<String,String>> set = answer.entrySet();   //set of entries		 
		Iterator<Entry<String,String>>  itr = set.iterator(); //getting iterator
	
		
		while(itr.hasNext())
		{
			Entry<String,String> entry = itr.next();
			
			System.out.print("Answer : "+entry.getKey());
			System.out.println("  Given By : "+entry.getValue());
					
		}
		
	}
	

}
