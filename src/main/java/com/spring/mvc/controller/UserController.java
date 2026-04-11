package com.spring.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;

@Controller
public class UserController {
	
	static Map<Integer,Employee> map=null;
	
	static int empid=0;
	
	static {
		
		map=new HashMap<>();
		
		map.put(++empid,new Employee(empid,"Neelanshu","IT","HAL"));
		map.put(++empid,new Employee(empid,"subham","civil","Lko"));
		map.put(++empid,new Employee(empid,"rahul","medical","delhi"));
		map.put(++empid,new Employee(empid,"risab","art","albd"));
	}

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
	public String createUser(@ModelAttribute Employee employee,Model model)
	{
		System.out.println(employee);
		employee.setId(++empid);
		
		map.put(++empid, employee);
		
		
		return "success";
	}
	
	@GetMapping("/getEmpById/{id}")
	public String getEmp(@PathVariable( name="id")int id ,Model model)
	{
	Employee e=	map.get(id);
	
		model.addAttribute("employee",e);
		
		return "success";
	}
	
}
