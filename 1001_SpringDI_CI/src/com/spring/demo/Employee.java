package com.spring.demo;

public class Employee 
{
    private int id;
    private String name;
    private Address address;
	
    public Employee() 
	{
		// TODO Auto-generated constructor stub
	}
    
    public Employee(int id,String name,Address address) 
	{
		// TODO Auto-generated constructor stub
    	super();
    	this.id = id;
    	this.name = name;
    	this.address = address;
	}
    
	public void displayInfo()
	{
		System.out.println("\nEmployee  "+"[Id : "+id+ "  Name : "+name+"]");
		
		System.out.println(address.toString());
	}
	
	

}
