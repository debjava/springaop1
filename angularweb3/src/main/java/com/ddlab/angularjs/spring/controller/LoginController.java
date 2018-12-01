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
	
////	@RequestMapping(value = "/logindetails/{userName}/{password}", method = RequestMethod.GET)
//	@RequestMapping(value = "/logindetails", method = RequestMethod.GET)
//	@ResponseBody
//	public String login() {
////		System.out.println("UserName :::"+userName);
////		System.out.println("Password :::"+password);
//		System.out.println("----------------------------");
//		return "successfull";
//	}
	
	@RequestMapping(value = "/check/{userName}/{password}", method = RequestMethod.GET)
	@ResponseBody
	public String check(@PathVariable("userName") String userName,@PathVariable("password") String password) {
		System.out.println("UserName :::"+userName);
		System.out.println("Password :::"+password);
		
		
		if( userName.equals("deb") && password.equals("deb")) {
//			return "login/success";
			return "newpage";
//			return new ModelAndView("newpage");
		}
		else {
//			return "login/registration";
			return "newpage";
//			return new ModelAndView("newpage");
		}
		
//		return "successful";
	}
	
//	@RequestMapping(value = "/newpage", method = RequestMethod.POST)
//	@ResponseBody
//	public String newpage() {
//		System.out.println("----------------------------");
//		return "newpage";
////		return "redirect:/jsp/newpage";
//	}
	
	
	@RequestMapping(value = "/newpage", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView newpage() {
		System.out.println("----------------------------");
		return new ModelAndView("newpage");
//		return "redirect:/jsp/newpage";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	@ResponseBody
	public String registration() {
		System.out.println("----------------------------");
		return "registration";
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	@ResponseBody
	public String success() {
		System.out.println("----------------------------");
		return "success";
	}
	
	
	

}
