package com.ictservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class ICTServiceOne {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<div style='text-align:center;'>"
				+ "<h1>********** Organisation Chart from JSON Data **********</h1></div>";
		return new ModelAndView("welcome", "message", message);
	}

	

}
