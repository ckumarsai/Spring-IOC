package com.saikumar.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements IUserDao {

	@Override
	public boolean saveuser(String username, String emailid, String password) {
		System.out.println("record inserted into database ..");
		return true;
	}

}
