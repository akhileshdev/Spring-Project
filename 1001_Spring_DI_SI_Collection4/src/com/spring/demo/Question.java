package com.spring.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question 
{
	private int id;
	private String question;
	private Map<Answer, User> answer;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getQuestion() 
	{
		return question;
	}

	public void setQuestion(String question) 
	{
		this.question = question;
	}

	public Map<Answer, User> getAnswer() 
	{
		return answer;
	}

	public void setAnswer(Map<Answer, User> answer) 
	{
		this.answer = answer;
	}
	
	public void displayInfo()
	{
		System.out.println("\nQuestion : [ID : "+id+" Question : "+question+" ]");
		
		Set<Entry<Answer,User>> set = answer.entrySet();		
		Iterator<Entry<Answer,User>> itr = set.iterator();
		
		while(itr.hasNext())
		{
			Entry<Answer,User> entry = itr.next();
			
			Answer ans = entry.getKey();
			User user = entry.getValue();
			
			System.out.println(ans);
			System.out.println(user);
		}
		
		
	}

}
