package com.websystique.springmvc.dao;


import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;
import javax.persistence.Query;

import com.websystique.springmvc.model.User;

@Repository("LoginRepo")
public class LoginRepoImpl extends AbstractDao implements LoginRepo {

	
	public boolean logintoRepo(String userName, String password) {
		System.out.println("in repo");
		List<User> userList= new  ArrayList<User>();
		 Query q =  entityManager.createQuery("select u from user u");
		 System.out.println("after query");
		 q.getResultList();
		 if (q.getResultList() != null){
			 System.out.println("in repo if");
			 for(User user:userList ){
				 System.out.println("in for loop");
				 System.out.println("user name is ;;;;; " +user.getUserName());
			 }
			 return true;
		 }
		 
		else{
			System.out.println("in repo else");

		return false;
		}
	}

}
