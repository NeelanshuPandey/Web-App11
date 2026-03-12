package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	
	@RequestMapping("/")
	public String meeting() {
		
		
		System.out.println("welcome controller");
		return "index";
	}
	
	
}
