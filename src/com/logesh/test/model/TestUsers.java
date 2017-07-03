package com.logesh.test.model;

import com.logesh.main.model.Users;

public class TestUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Users users = new Users();
		
		users.setId(7);
		users.setUsername("Logesh S");
		users.setEmailid("logesh@gmail.com");
		users.setPassword("pass123");
		
		System.out.println(users);
	}

}
