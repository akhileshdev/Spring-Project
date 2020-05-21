package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController 
{     
	  @RequestMapping("/request")
      public String hello(@RequestParam("uname")String name,@RequestParam("upass")String pass,Model m)
      {   
		  //Using @RequestParam Annotation to Bind form data to parameter of methods 
		  
		  //Hence Extra code and HttpsServletRequest is not required.
		  
		  
    	   //String name = req.getParameter("uname");
    	   //String pass = req.getParameter("upass");
		  
		   if(pass.equals("admin"))
		   {
			   String msg = "Hello "+name;			   
			   m.addAttribute("message",msg);
			   
			   return "loginSuccess.jsp";
		   }
		   else
		   {
			   String msg = "Sorry "+name+"!!   You have entered wrong Userid/Password";
			   m.addAttribute("message",msg);
			   
			   return "loginError.jsp";
		   }
    	   
    	   
      }
}
