package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A ab = (A)context.getBean("a", A.class);
		
		ab.display();

	}

}
