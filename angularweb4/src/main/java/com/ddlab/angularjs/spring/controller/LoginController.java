package com.ddlab.angularjs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value = "/login/{userName}/{password}", method = RequestMethod.GET)
	@ResponseBody
	public String check(@PathVariable("userName") String userName,@PathVariable("password") String password) {
		System.out.println("UserName :::"+userName);
		System.out.println("Password :::"+password);
		if( userName.equals("deb") && password.equals("deb")) {
			return "registrationpage";
		}
		else {
			return "registrationpage";
		}
	}
	
	@RequestMapping(value = "registrationpage", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView newpage() {
		System.out.println("-------------TTTTTTTTTTTTTTT---------------");
		return new ModelAndView("registrationpage");
//		return "redirect:/jsp/newpage";
	}

}
