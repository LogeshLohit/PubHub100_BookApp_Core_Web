package com.logesh.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.logesh.main.model.Users;
import com.logesh.main.util.ConnectionUtil;

public class UsersDAO {

	public void register(Users users) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;

		try {
			connection = ConnectionUtil.getConnection();

			String sql = "insert into users(username,emailid,password) values(?,?,?);";

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, users.getUsername());
			preparedStatement.setString(2, users.getEmailid());
			preparedStatement.setString(3, users.getPassword());

			int row = preparedStatement.executeUpdate();

			System.out.println("No. of rows inserted:" + row);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement!=null)
				{
				preparedStatement.close();
				}
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public boolean login(String username, String password) throws SQLException {
		boolean flag = false;
		PreparedStatement preparedStatement = null;
		Connection connection = null;

		try {
			connection = ConnectionUtil.getConnection();

			String sql = "select username from users where emailid=? and password=?;";

			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				flag = true;
				System.out.println(rs.getString(1));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement!=null)
				{
				preparedStatement.close();
				}
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}

		

		return flag;

	}
}
