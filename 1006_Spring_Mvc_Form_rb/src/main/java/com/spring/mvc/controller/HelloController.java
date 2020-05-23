package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.bean.Reservation;

@Controller
public class HelloController 
{
    @RequestMapping("/reservationForm") 
	public String bookingForm(Model model)
	{
		Reservation res = new Reservation();		
		model.addAttribute("reservation",res);
    	
    	return "reservation-page.jsp";
	}
    
    @RequestMapping("/submitForm") 
	public String confirmationForm(@ModelAttribute("reservation")Reservation res)
	{   	
    	return "confirmation-page.jsp";
	}
	
	
}
