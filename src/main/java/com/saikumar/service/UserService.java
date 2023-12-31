package com.saikumar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saikumar.dao.IUserDao;

@Component
public class UserService {
	
	// Seter Injuction
//	@Autowired
//	public void setPwdService(PasswordService pwdService) {
//		this.pwdService = pwdService;
//	}
//
	//Seter Injuction
//	@Autowired
//	public void setUserDao(IUserDao userDao) {
//		this.userDao = userDao;
//	}
//
	// Seter Injuction
//	@Autowired
//	public void setEmailService(EmailService emailService) {
//		this.emailService = emailService;
//	}
	
	
	// Constructor Injuction
//	public UserService(PasswordService pwdService, IUserDao userDao, EmailService emailService) {
//		super();
//		System.out.println("param constructor");
//		this.pwdService = pwdService;
//		this.userDao = userDao;
//		this.emailService = emailService;
//	}


	@Autowired
	private PasswordService pwdService;
	
	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private EmailService emailService;
	
	public void registerUser(String name, String email,String password) {
		
		//encrypt password 
		String encryptedpassword=pwdService.encryptPassword(password);
		
		//save user in db
		boolean isSave=userDao.saveuser(name, email, encryptedpassword);
		
		//send email
		if(isSave) {
			boolean isSent=emailService.sendEmail(email, "Test subject", "Test body");
			if(isSent) {
				System.out.println("User Registration completed");
			}
		}
	}

}
