package com.websystique.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.LoginRepo;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepo loginRepo;
	public boolean logintoService(String userName, String password) {
		System.out.println("in service");
		boolean status=loginRepo.logintoRepo(userName, password);
		if(status){
			System.out.println("in if");
			return true;
		}
		else{
			System.out.println("in else");
		return false;
		}
	}

}
