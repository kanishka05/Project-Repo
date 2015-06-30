package com.websystique.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/")
@SessionAttributes("email")
public class AppController {

	@Autowired
	EmployeeService service;

	/*
	 * This method will list all existing employees.
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

		List<Employee> employees = service.findAllEmployees();
		model.addAttribute("employees", employees);
		return "allemployees";
	}

	/*
	 * This method will provide the medium to add a new employee.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newEmployee(ModelMap model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "registration";
	}

	/*
	 * This method will be called on form submission, handling POST request for
	 * saving employee in database. It also validates the user input
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}

		service.saveEmployee(employee);

		model.addAttribute("success", "Employee " + employee.getName()
				+ " registered successfully");
		return "success";
	}

	/*
	 * This method will delete an employee by it's SSN value.
	 */
	@RequestMapping(value = { "/delete-{ssn}-employee" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable String ssn) {
		service.deleteEmployeeBySsn(ssn);
		return "redirect:/list";
	}
	
	@RequestMapping(value = "loginPage", method = RequestMethod.GET)
	public String loginPage(ModelMap model){
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public @ResponseBody String login(ModelMap model,@RequestParam String email,@RequestParam String password,HttpServletRequest request, HttpServletResponse response){
		System.out.println("in login contrller");
		HttpSession session = request.getSession();
		session.setAttribute("email", email);
		boolean status=service.isUSer(email,password);
		//User user=new User();
		if(status){
			//session.setAttribute("userName", userName);
			String msg="Successfully logged in";
			model.addAttribute("msg",msg);
			return "success";
		}
		else{
			String msg="Unable to logged in";
			model.addAttribute("msg",msg);
			return "failure";
		}
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public @ResponseBody String register(ModelMap model,HttpServletRequest request,@RequestParam String fname,@RequestParam String lname,@RequestParam String email,@RequestParam String pass,@RequestParam String dateOb){
		System.out.println("comiing here to register controller");
		HttpSession session = request.getSession();
		service.addUser(fname,lname,email,pass,dateOb);
		return "success"; 
	}
	
	@RequestMapping(value = "homepage", method = RequestMethod.GET)
	public String homepage(ModelMap model){
		return "homepage";
	}
	
	@RequestMapping(value = "myProfile", method = RequestMethod.GET)
	public String myProfile(){
		return "myProfile";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public @ResponseBody String logout(ModelMap model,HttpServletRequest request){
		HttpSession session = request.getSession();
		System.out.println("user in session is  : : :" +session.getAttribute("userName"));
		session.invalidate();
		System.out.println("after closing the session   : : :" +session.getAttribute("email"));
		return "success";
	}
	
	@RequestMapping(value = "profilePageOne", method = RequestMethod.POST)
	public String profilePageOne(ModelMap model){
		return "myProfile";
	}
	

	

}