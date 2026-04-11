package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;

@Controller
public class UserController {

	@GetMapping("/")
	public String Welcome() {
		
		return "index";
		
	}
	@GetMapping("/sign-up")
	public String signup() {
		
		return "signup";
	}
	
	
	@PostMapping("/signupUser")
	public String postUser(@RequestParam(name="username") String username,@RequestParam(name="department") String department,@RequestParam(name="address") String address,Model model)
	{
		System.out.println("username1:"+username);
		System.out.println("department1:"+department);
		System.out.println("address1:"+address);
		
		
		model.addAttribute("username", username);
		model.addAttribute("department",department);
		model.addAttribute("address",address);
		
		
		
		return "success";
	}
	
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute Employee employee)
	{
		System.out.println(employee);
		
		
		return "success";
	}
	
	
}
