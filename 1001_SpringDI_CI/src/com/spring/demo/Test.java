package com.spring.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		//Resource resource = new ClassPathResource("applicationContext.xml");		
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee empl = (Employee)context.getBean("emp");
		
		empl.displayInfo();

	}

}
