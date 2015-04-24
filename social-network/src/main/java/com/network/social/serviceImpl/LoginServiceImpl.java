package com.network.social.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.network.social.repositoryImpl.LoginServiceRepoImpl;
import com.network.social.service.LoginService;


public class LoginServiceImpl implements LoginService {

	private static final Logger log = LoggerFactory
			.getLogger(LoginServiceImpl.class);
	
	LoginServiceRepoImpl loginServiceRepo=new LoginServiceRepoImpl();
	public boolean loginValidationService(String userName, String password) {
		System.out.println("in service method");
		log.debug("in login service");
		
		return this.loginServiceRepo.loginValidationRepo(userName, password);
		
	}
}
