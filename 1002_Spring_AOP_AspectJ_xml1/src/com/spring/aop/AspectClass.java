package com.spring.aop;

import org.aspectj.lang.JoinPoint;

public class AspectClass 
{
        public void myadvice(JoinPoint jp)
        {
        	System.out.println("Additional concern @BeforeAdvice ");
        }

}
