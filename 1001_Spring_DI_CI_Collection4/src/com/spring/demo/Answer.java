package com.spring.demo;

public class Answer 
{
    private int id;
    private String answer;
    
	public Answer(int id,String answer) 
	{
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.answer = answer;
	}

	@Override
	public String toString() 
	{
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}
	
	
}
