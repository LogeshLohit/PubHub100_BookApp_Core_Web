package com.logesh.test.dao;

import java.sql.SQLException;

import com.logesh.main.dao.UsersDAO;
import com.logesh.main.model.Users;

public class TestUsersDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsersDAO dao = new UsersDAO();
		Users users = new Users();
		
	/*	users.setUsername("Logesh S");
		users.setEmailid("logesh@gmail.com");
		users.setPassword("pass123");
		
		dao.register(users);
	*/
		try {
			dao.login("logesh@gmail.com", "pass123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
