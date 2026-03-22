package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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


	@GetMapping("/req-param")   //give input in url (/req-param?user=Ashish)
	public String createUser(@RequestParam(name = "user",defaultValue="my-default-name") String name, Model model) {
		
		model.addAttribute("user", name);

		System.out.println("WelcomeController.greeting :" + name);

		return "success";
	}
	@GetMapping("/path-var/{id}") // 1-read data from url by @GetMapping and store in {id} and then @PathVariable take data from @GetMapping
	public String pathVariable(@PathVariable(name = "id") int id, Model model) {
		
		//path variable read the data from end point of url
		
		model.addAttribute("user","sorry this:"+id+" user is not found our db");

		System.out.println("WelcomeController.PathVariable");

		return "success";
	}
	
	
}
