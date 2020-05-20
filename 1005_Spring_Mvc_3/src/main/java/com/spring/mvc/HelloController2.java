package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController2 
{     
	 @RequestMapping("/request2")
     public String hello()
     {
    	 return "springMvc.jsp";
     }
}
