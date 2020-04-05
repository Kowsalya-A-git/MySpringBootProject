package com.javainuse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javainuse.SpringBootHelloWorldApplication;

@Controller
public class TestController {

	@RequestMapping("/")
	public String firstPage() {
		
		return "home";
	}
	@GetMapping("/welcome")
	public String loginPage(Model model)
	{
		SpringBootHelloWorldApplication u=new SpringBootHelloWorldApplication();
		model.addAttribute("user",u);
		return "welcome";
	}
	@PostMapping("/userwel")
	public String show(@ModelAttribute("user") SpringBootHelloWorldApplication u)
	{
		if(u.getName().equals("fresherpro")&&u.getPassword().equals("fresherpro"))
		  return "userwel";
		else
		  return "errorPage";
	}
		
	}
	
	


