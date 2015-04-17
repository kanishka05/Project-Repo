package com.network.social.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.network.social.serviceImpl.LoginServiceImpl;


@Controller
public class DemoController {
	

LoginServiceImpl loginService=new LoginServiceImpl(); 

	@RequestMapping(value="/demo")
	public String demofunc(ModelMap model){
		System.out.println("comes to controller");
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String demoLogin(ModelMap model){
		System.out.println("login");
		boolean isUser=loginService.loginValidationService();
		if(isUser==true){
		return "login";
		}
		else{
			return "homepage";
		}
	}

	
}
