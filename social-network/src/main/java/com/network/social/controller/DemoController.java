package com.network.social.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




import com.network.social.model.User;
import com.network.social.serviceImpl.LoginServiceImpl;


@Controller
public class DemoController {
	
	private static final Logger log = LoggerFactory
			.getLogger(DemoController.class);

LoginServiceImpl loginService=new LoginServiceImpl(); 

	@RequestMapping(value="/demologin")
	public String demofunc(ModelMap model){
		System.out.println("comes to controller");
		log.debug("in demo Login");
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String demoLogin(ModelMap model,@RequestParam String userName,@RequestParam String password){
		System.out.println("login");
		log.debug("in login");
		
		
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
