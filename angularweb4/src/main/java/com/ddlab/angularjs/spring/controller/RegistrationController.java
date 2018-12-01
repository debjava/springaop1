package com.ddlab.angularjs.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ddlab.angularjs.spring.models.RegistrationModel;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public String register( @RequestBody RegistrationModel regModel ) {
		System.out.println("******************REGISTRATION***********************");
		System.out.println("First Name :::"+regModel.getFirstName());
		System.out.println("Last Name :::"+regModel.getLastName());
		System.out.println("Email :::"+regModel.getEmail());
		return "success";
	}
	
	@RequestMapping(value = "success", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView newpage() {
		return new ModelAndView("success");
	}

}
