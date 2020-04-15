package com.spring.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question 
{
    private int id;
    private String ques;
    private Map<Answer,User> answer;  //map with dependent object
    
	public Question(int id,String ques,Map<Answer,User> answer) 
	{
		// TODO Auto-generated constructor stub
		this.id = id;
		this.ques = ques;
		this.answer = answer;
	}
	
	public void displayInfo()
	{
		System.out.println("Question : [ ID : "+id+" Question : "+ques);
		System.out.println("Answer :-");
		
		Set<Entry<Answer,User>> set = answer.entrySet();  //converting Map into Set	
		Iterator<Entry<Answer,User>> itr = set.iterator();
		
		while(itr.hasNext())
		{
			Entry<Answer,User> entry = itr.next();
			
			Answer ans = entry.getKey();
			User user = entry.getValue();
			
			System.out.println(ans.toString());
			System.out.println(user.toString()+"\n");			
			
		}
		
	}

}
