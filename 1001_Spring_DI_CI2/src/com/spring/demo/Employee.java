package com.spring.demo;

public class Employee 
{
    private int id;
    private String name;
	
    public Employee()
    {
    	
    }
        
	public Employee(int id,String name)
	{
		super();
		
	    this.id = id;
	    this.name = name;
		
	}

	@Override
	public String toString() 
	{
		return "Employee [Id=" + id + ", Name=" + name + "]";
	}

	

}
