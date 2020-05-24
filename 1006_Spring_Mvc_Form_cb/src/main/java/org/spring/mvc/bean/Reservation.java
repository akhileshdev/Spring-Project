package org.spring.mvc.bean;

//It is our bean class 

public class Reservation 
{
    private String firstName;
    private String lastName;
    private String gender;
    private String []food;  // there can be multiple option for food hence taking array
    
    
    
	public Reservation() 
	{
		super();
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String[] getFood() {
		return food;
	}



	public void setFood(String[] food) {
		this.food = food;
	}
	
	
	
    
}
