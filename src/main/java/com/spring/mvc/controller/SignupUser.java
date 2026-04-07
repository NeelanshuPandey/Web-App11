package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupUser {

	
	
	
	@GetMapping("/")
	public String welcome() {
		
		System.out.println("welcome ");
		
		return "index";
	}
	@GetMapping("/sign-up")
	public String signup() {
		
		System.out.println("signup");
		
		return "sign-up";
	}
	
	
	
	
	
	@PostMapping("/signupUser")
	public String signupUser(@RequestParam (name="username")String username, @RequestParam(name="department")String department,@RequestParam(name="address")String address, Model model) {
		
		
		 System.out.println(username);
		    System.out.println(address);
		    System.out.println(department);

		    model.addAttribute("username", username);
		    model.addAttribute("address", address);
		    model.addAttribute("department", department);

		    return "success";
		    
		    
		    
		    
		   
	}
	
}
	
	
	

