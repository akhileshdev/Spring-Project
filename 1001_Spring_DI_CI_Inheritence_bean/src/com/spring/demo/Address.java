package com.spring.demo;

public class Address 
{
   private String street;
   private String city;
   private String state;
   private String country;
 
	public Address(String street, String city, String state, String country) 
	{
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() 
	{
		return "Address [street=" + street + ", city=" + city + ", State=" + state + ", country=" + country + "]";
	}


	

}
