package com.spring.aop;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice
{
      public void afterThrowing(Exception ex)
      {
    	  System.out.println("Additional Concern if exception Occurs");
      }
	

}
