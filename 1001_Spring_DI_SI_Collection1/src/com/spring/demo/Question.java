package com.spring.demo;

import java.util.Iterator;
import java.util.List;

public class Question 
{
     private int id;
     private String ques;
     private List<Answer> answer;   //HAS-A relation with dependent object 'Aggregation Relation'
     
     
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<Answer> getAnswer() 
	{
		return answer;
	}
	public void setAnswer(List<Answer> answer) 
	{
		this.answer = answer;
	}
     
    public void displayInfo() 
    {
    	System.out.println("\nQuestion : [ID : "+id+" Question : "+ques+" ] ");
    	
    	Iterator<Answer> itr = answer.iterator();
    	
    	while(itr.hasNext())
    	{
    		Answer ans = itr.next();
    		
    		System.out.println(ans);
    	}
    	
    }

}
