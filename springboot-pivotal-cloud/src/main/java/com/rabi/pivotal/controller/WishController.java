package com.rabi.pivotal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class WishController {
	
	@GetMapping("/wishRabi")
	public String greeting(@RequestParam("name")
	               String name,Model model) {
		
		String message1="Hi "+name
				+" welcome to Java Rabi!!!";
		model.addAttribute("message12",message1);
		return "homeR";
	}

}
