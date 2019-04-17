package com.pluralsight.controller;

import org.springframework.ui.Model;

public class HelloController {

	public String sayHello(Model model)
	{
		model.addAttribute("greeting", "Hello World");
		
		return "Hello";
	}
	
}
