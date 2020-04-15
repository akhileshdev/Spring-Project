package com.spring.demo;

public class Employee 
{
   private int id;
   private String name;
   private Address address;
   
   
   public Employee(int id,String name)
   {
	   this.id = id;
	   this.name = name;
	   
	   System.out.println("\n1st constructor");
   }
   
   
	public Employee(int id,String name,Address address) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
		
		System.out.println("\n2nd Constructor");
	}
	
	public void displayInfo()
	{
		System.out.println("Employee : [ID : "+id+" Name : "+name+" ] ");
		System.out.println(address);
	}
	
}
