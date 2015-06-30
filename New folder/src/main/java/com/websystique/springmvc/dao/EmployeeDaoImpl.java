package com.websystique.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Employee;
import com.websystique.springmvc.model.User;
import com.websystique.springmvc.model.User;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao{

	public  Session session = null;
	public void saveEmployee(Employee employee) {
		persist(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployees() {
		Criteria criteria = getSession().createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
	}

	public void deleteEmployeeBySsn(String ssn) {
		Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
		query.setString("ssn", ssn);
		query.executeUpdate();
	}
	
	public List<User> allUsers(){
		System.out.println("in user repo");
		Criteria criteria = getSession().createCriteria(User.class);
		System.out.println("after query");
		return (List<User>) criteria.list();
	}
	
	public boolean isUSer(String email, String password){
		List<User> list=new ArrayList<User>();
		
		System.out.println("in login repo before query");
		
		Criteria criteria = getSession().createCriteria(User.class);
		System.out.println("after query");
		list=(List<User>) criteria.list();
		for(User user:list){
			System.out.println("in for loop");
			System.out.println("userName is :"+user.getEmail());
			System.out.println("password is: "+user.getPassword());
			
			if((user.getEmail()).equals(email) && (user.getPassword()).equals(password)){
				System.out.println("in repo if");
				return true;
			}
			else{
				System.out.println("in repo else");
				return false;
			}
		}
		
		return false;
	}
	
	public void addUser(String fname,String lname,String email,String pass,String dateOb){
		System.out.println("in add user repo");
		User newuser=new User();
		newuser.setPassword(pass);
		newuser.setLastName(lname);
		newuser.setFirstName(fname);
		newuser.setEmail(email);
		newuser.setDob(dateOb);
		newuser.setUserId(1);
		System.out.println("adding to the table");
		save(newuser);
		System.out.println("after adding to the table");
		
	}
	
}