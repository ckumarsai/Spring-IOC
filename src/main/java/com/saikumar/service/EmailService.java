package com.saikumar.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
	public boolean sendEmail(String to, String sub, String body) {
		System.out.println("sending mail");
		return true;
	}
}
