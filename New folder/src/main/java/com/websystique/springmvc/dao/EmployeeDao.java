package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.model.User;

public interface EmployeeDao {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	void deleteEmployeeBySsn(String ssn);
	
	public List<User> allUsers();
	
	public boolean isUSer(String userName, String password);
	
	public void addUser(String fname,String lname,String email,String pass,String dateOb);
}
