package com.spring.demo;

public class A 
{
   private static A a = new A();
   
	public A() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static A getA()
	{
		return a;
	}
	
	public void display()
	{
		System.out.println("class A");
	}

}
