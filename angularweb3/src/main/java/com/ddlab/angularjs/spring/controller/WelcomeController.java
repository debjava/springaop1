package com.ddlab.angularjs.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String initForm() {
		System.out.println("Coming here....");
		return "test";
	}

}
