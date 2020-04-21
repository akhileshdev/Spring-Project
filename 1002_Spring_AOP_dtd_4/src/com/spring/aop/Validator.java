package com.spring.aop;

public class Validator {

	public void Validate(int age) throws Exception
	{
		if(age < 18)
			 throw new ArithmeticException("Not a valid Age");
		else
			System.out.println("Vote casted");		
		
	}

}
