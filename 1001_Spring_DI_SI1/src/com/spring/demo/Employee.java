package com.spring.demo;

public class Employee 
{ 
	private int id;       //primitive value
	private String name;  //primitive value
	
	
	//using setter injection
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void displayInfo()
	{
		System.out.println("\nID : "+id+" Name : "+name);
	}

}
