package com.websystique.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.websystique.springmvc.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="demologin" , method = RequestMethod.GET)
	public String loginProvider(){
		System.out.println("in controller");
		return "login";
	}
	
	@RequestMapping(value="login" , method = RequestMethod.GET)
	public String login(@RequestParam String userName ,@RequestParam String password){
		System.out.println("in get in");
		boolean status=loginService.logintoService(userName, password);
		if(status){
			return "success";
		}
		else{
			return "login";
		}
			
		
		
		
	}

}