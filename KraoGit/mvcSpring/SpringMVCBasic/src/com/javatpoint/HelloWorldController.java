package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(){
		System.out.println("coming to hello controller");
		String message="Hello Spring MVC how r u";
		return new ModelAndView("hellopage","message",message);
	}
	


	@RequestMapping(value = "index", method = RequestMethod.POST)
	public @ResponseBody String showIndex(ModelMap model,@RequestParam String show){
		System.out.println("coming to index controller");
		return "success";
	}
	
	@RequestMapping(value = "about", method = RequestMethod.GET)
	public @ResponseBody  String showAbout(ModelMap model){
		System.out.println("coming to about controller");
		return "about";
	}
	
	@RequestMapping(value="services", method=RequestMethod.GET)
	public @ResponseBody String showServices(ModelMap model){
		System.out.println("in services controller");
		return "services";
	}
	
	@RequestMapping(value="location", method=RequestMethod.GET)
	public @ResponseBody String showLocation(ModelMap model){
		System.out.println("in location controller");
		return "location";
	}
	
	@RequestMapping(value="contact",method=RequestMethod.GET)
	public @ResponseBody String showContact(ModelMap model){
		System.out.println("in contact controller");
		return "contact";
	}
	
	@RequestMapping(value="blog",method=RequestMethod.GET)
	public @ResponseBody String showBlog(ModelMap model){
		System.out.println("in blog controller");
		return "blog";
	}
	
	@RequestMapping(value="page1",method=RequestMethod.GET)
	public  String showPage1(ModelMap model){
		System.out.println("in blog controller");
		return "page1";
	}
}

