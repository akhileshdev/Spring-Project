package com.spring.mvn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController 
{     
	  @RequestMapping("/request1")
      public String hello()
      {
    	  return "helloSpring.jsp";  //1st request, i.e 1st view
      }
	  
	  @RequestMapping("/request2")
      public String MVChello()
      {
    	  return "helloMVC.jsp";   //2nd request, i.e another view
      }
}
