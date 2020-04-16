package com.spring.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question 
{
    private int id;
    private String question;
    private Map<String,String> answer;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<String, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<String, String> answer) {
		this.answer = answer;
	}
	
    public void displayInfo()
    {
    	System.out.println("\nQuestion : [ID : "+id+" Question : "+question+" ]");
    	
    	Set<Entry<String,String>> set = answer.entrySet();    	
    	Iterator<Entry<String,String>> itr = set.iterator();
    	
    	while(itr.hasNext())
    	{   
    		Entry<String,String> entry = itr.next();
    		
    		System.out.println(" Ans : "+entry.getKey()+" By : "+entry.getValue());
    	}
    	
    }
}
