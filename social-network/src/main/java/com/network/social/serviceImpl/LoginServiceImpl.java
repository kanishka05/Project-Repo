package com.network.social.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.network.social.repository.LoginServiceRepo;
import com.network.social.repositoryImpl.LoginServiceRepoImpl;
import com.network.social.service.LoginService;


public class LoginServiceImpl implements LoginService {

	LoginServiceRepoImpl loginServiceRepo=new LoginServiceRepoImpl();
	public boolean loginValidationService(){
		System.out.println("in service method");
		boolean isUser=loginServiceRepo.loginValidationRepo();
		return isUser;
	}
}