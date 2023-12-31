package com.saikumar.service;

import org.springframework.stereotype.Component;

@Component
public class PasswordService {
	public String encryptPassword(String pwd) {
		System.out.println("encrypt password");
		return "encrypted password";
	}
}
