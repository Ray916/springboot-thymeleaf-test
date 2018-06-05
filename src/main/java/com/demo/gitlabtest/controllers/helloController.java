package com.demo.gitlabtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
	
	@RequestMapping("/")
	public String index(Model model){
		
		String name = "WORLD";
		model.addAttribute("name", "HELLO " + name + ".");
		return "index";
	}
}
