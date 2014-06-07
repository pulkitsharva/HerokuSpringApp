package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
	@RequestMapping(value="/index")
	public String index(Model model)
	{
		System.out.println("coming here");
		model.addAttribute("springVar","Pulkit Sharva");
		return "welcome";
	}
	
}
