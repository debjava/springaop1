package com.ddlab.angularjs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping(value = "/logindetails/{userName}/{password}", method = RequestMethod.GET)
	@ResponseBody
	public String login(String userName,String password) {
		System.out.println("UserName :::"+userName);
		System.out.println("Password :::"+password);
		
		return "successfull";
	}

}
