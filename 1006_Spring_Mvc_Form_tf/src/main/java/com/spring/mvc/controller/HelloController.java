package com.spring.mvc.controller;

import com.spring.mvc.bean.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController 
{   
	@RequestMapping("/bookingForm")
	public String bookingForm(Model model)
	{   
		Reservation res = new Reservation();
		model.addAttribute("reservation",res);
		
		//reservation-page will receive "Reservation" object as model attribute
		//we are passing that attribute through Model reference 'model'
		return "reservation-page.jsp";
	}	
	
	@RequestMapping("/submitForm")
    public String submitForm(@ModelAttribute("reservation")Reservation res)
    {   
		//with @ModelAttribute("reservation") method, submitForm() will extract data from view page in "reservation" identifier
		//And value in 'reservation' will be binded with method parameter 'res' 
		
		return "confirmation-page.jsp";
    }
	
}
