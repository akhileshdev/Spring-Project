package org.spring.mvc.controller;

import org.spring.mvc.bean.Reservation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController 
{     
	  @RequestMapping("/reservationRequest")  //this method will do processing for request 'reservationRequest'
      public String bookingProcessing(Model model)
      {
    	  Reservation rs = new Reservation();
		  model.addAttribute("reservation",rs);
    	      	  
		  return "reservation-page.jsp";
      }
	  
	  @RequestMapping("/submitForm")
	  public String confirmationProcessing(@ModelAttribute("reservation")Reservation rs)
	  {
		  
		  return "confirmation-page.jsp";
	  }
}
