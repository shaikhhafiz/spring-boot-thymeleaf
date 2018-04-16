package com.hafiz.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String hello(Model model) {
		model.addAttribute("text", "This is thymeleaf test");
		return "index";
	}
}
