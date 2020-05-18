package com.spring.mvn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController 
{     
	  @RequestMapping("/request1")
      public String hello()
      {
    	  return "index.jsp";
      }
}
