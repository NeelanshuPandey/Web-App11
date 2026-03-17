package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
@Controller
public class WelcomeController {

	@GetMapping("/")
	public String greeting() {
		System.out.println("WelcomeController.greeting()");
		return "index";
	}

	@GetMapping("/req-param")
	public String createUser(@RequestParam(name = "user") String name, Model model) {
		
		model.addAttribute("user", name);

		System.out.println("WelcomeController.greeting :" + name);

		return "success";
	}

	
	
}
