package com.network.social.serviceImpl;

import com.network.social.repositoryImpl.LoginServiceRepoImpl;
import com.network.social.service.LoginService;


public class LoginServiceImpl implements LoginService {

	LoginServiceRepoImpl loginServiceRepo=new LoginServiceRepoImpl();
	public boolean loginValidationService(String userName, String password) {
		System.out.println("in service method");
		
		return this.loginServiceRepo.loginValidationRepo(userName, password);
		
	}
}
