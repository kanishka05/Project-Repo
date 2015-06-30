package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.EmployeeDao;
import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.model.User;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	public void deleteEmployeeBySsn(String ssn) {
		dao.deleteEmployeeBySsn(ssn);
	}
	
	public List<User> allUsers(){
		System.out.println("in get all users service");
		return dao.allUsers();
	}
	
	public boolean isUSer(String email,String password){
		System.out.println("in login srvice");
		 return dao.isUSer(email,password);
	}
	
	public void addUser(String fname,String lname,String email,String pass,String dateOb){
		System.out.println("in add user service");
		 dao.addUser(fname,lname,email,pass,dateOb);
	}

}
