package com.spring.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test 
{

	public Test() 
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ExpressionParser parser = new SpelExpressionParser();
		
		System.out.println("Parser : "+parser.parseExpression("'Welcome to '+'Spring Spel'").getValue());
		
		System.out.println("Parser : "+parser.parseExpression("10*10/2").getValue());
		

	}

}
