package com.spring.demo;

import java.util.Iterator;
import java.util.List;

public class Question
{
    private int id;
    private String question;    
    private List<Answer> answers;
    
	public Question(int id,String question,List<Answer> answers) 
	{
		this.id = id;
		this.question = question;
		this.answers = answers;
		
	}
	
	public void displayInfo()
	{
		System.out.println("Question [id=" + id + ", ans=" + question);		
		System.out.println("Answers are :-"); 
		
		Iterator <Answer> itr = answers.iterator();
		
		while(itr.hasNext())
		{
			Answer asr = itr.next();
			
			System.out.println(asr.toString());
		}		
		
	 }		

}
