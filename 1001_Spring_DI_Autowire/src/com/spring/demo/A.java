package com.spring.demo;

public class A 
{
    private B b;  //Reference 'b' name must be same as Bean ID in xml file
                  //if bean ID name is not same as reference name then setter injection of B will not be invoked.
    
	public A() 
	{
		System.out.println("A created");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) 
	{
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
