package com.spring.aop;

public class Logic 
{   
	public void validate(int age) throws Exception
	{
		if(age < 18)
			throw new ArithmeticException("Not a Valid Age");
		else
			System.out.println("Vote Casted");		
		
	}	

}
