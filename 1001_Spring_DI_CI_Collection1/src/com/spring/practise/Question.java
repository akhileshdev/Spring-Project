package com.spring.practise;

import java.util.Iterator;
import java.util.List;

public class Question 
{
    private int id;
    String ques;   
    private List<String> answer;
		
	public Question(int id,String ques,List<String> answer)
	{   
		super();
		this.id = id;
		this.ques = ques;
		this.answer = answer;
	}

	//@Override
	public void displayInfo() 
	{
		System.out.println("\nQuestion [id=" + id + ", ques=" + ques + "]");
		
		System.out.println("\nAnswers are :-");
		
		Iterator <String> itr = answer.iterator();   //using list here, in collection
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	

}
