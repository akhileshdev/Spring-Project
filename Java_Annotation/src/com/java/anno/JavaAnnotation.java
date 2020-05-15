package com.java.anno;

class Animal
{
     public void eatSomething()
     {
    	 System.out.println("Animal Eating");
     }
}

class Dog extends Animal
{	
	
	@Override
	public void eatSomething()
	{
		System.out.println("Eating Bread");
	}
}

public class JavaAnnotation 
{

	public static void main(String[] args) 
	{
		Animal obj = new Animal();
		
		obj.eatSomething();		

	}

}
