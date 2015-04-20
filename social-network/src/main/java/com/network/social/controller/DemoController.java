package com.network.social.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import com.network.social.model.User;
import com.network.social.serviceImpl.LoginServiceImpl;


@Controller
public class DemoController {
	

LoginServiceImpl loginService=new LoginServiceImpl(); 

	@RequestMapping(value="/demologin")
	public String demofunc(ModelMap model){
		System.out.println("comes to controller");
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String demoLogin(ModelMap model,@RequestParam String userName,@RequestParam String password){
		System.out.println("login");
		
		boolean isUser=loginService.loginValidationService(userName,password);
		String message=null;
		
		if(isUser==true){
			message="you are logged in";
			System.out.println(message);
			model.addAttribute("message", message);
			return "homepage";
		}
		else{
			 message="you are unable yo looged in";
			 System.out.println(message);
			 model.addAttribute("message", message);
			 return "login";
		}
		
	}

	
}
