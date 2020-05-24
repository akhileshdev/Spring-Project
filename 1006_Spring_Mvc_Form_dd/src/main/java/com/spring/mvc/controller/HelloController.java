package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.bean.Reservation;

@Controller
public class HelloController 
{    
	 @RequestMapping("/reservationFormRequest")  //It will map incoming request with name "reservationFormRequest" to below method for processing
     public String reservationProcess(Model model)
     {   
		 Reservation rs = new Reservation();  //Creating Reservation class Object to add it in model object
		 model.addAttribute("reservation",rs); //Adding bean class object 'res' to model attribute with name "reservation" 
    	 
		 return "reservation-page.jsp"; //It will simply redirect to page reservation-page.jsp
		 
		 //Model class attributed added here will be passed to other view pages 
		 //so that bean class fields can be accessed from view pages with the help of added attribute with name ('reservation' in this case)
     }
	 
	 @RequestMapping("/submitFormRequest") //It will map incoming request with name "submitFormRequest" to below method for processing
	 public String confirmationProcess(@ModelAttribute("reservation")Reservation rs)
	 {
		 return "confirmation-page.jsp"; //It will simply redirect to page confirmation-page.jsp
	 }
}
