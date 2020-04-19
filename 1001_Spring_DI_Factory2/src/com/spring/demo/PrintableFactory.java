package com.spring.demo;

public class PrintableFactory 
{
     public static Printable getPrintable()
     {
    	 return new A();        //returning instance of class A
     }
}
