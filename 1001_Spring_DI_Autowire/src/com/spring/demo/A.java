package com.spring.demo;

public class A 
{
    private B b;
    
	public A() 
	{
		System.out.println("A created");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	public void print()
	{
		System.out.println("Printing A class ");
	}
	
	public void display()
	{
		print();
		b.print();
	}

}
