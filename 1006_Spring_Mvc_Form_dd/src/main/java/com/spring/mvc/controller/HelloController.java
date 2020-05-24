package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.bean.Reservation;

@Controller
public class HelloController 
{    
	 @RequestMapping("/reservationFormRequest")
     public String reservationProcess(Model model)
     {   
		 Reservation rs = new Reservation();
		 model.addAttribute("reservation",rs);
    	 
		 return "reservation-page.jsp";
     }
	 
	 @RequestMapping("/submitFormRequest")
	 public String confirmationProcess(@ModelAttribute("reservation")Reservation rs)
	 {
		 return "confirmation-page.jsp";
	 }
}
