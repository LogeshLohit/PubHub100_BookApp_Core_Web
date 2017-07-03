package com.logesh.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.logesh.main.dao.UsersDAO;
import com.logesh.main.model.Users;

/**
 * Servlet implementation class UsersRegistration
 */
@WebServlet("/UsersRegistration")
public class UsersRegistration extends HttpServlet {

	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 * 
	 *//**
		 * @see HttpServlet#doPost(HttpServletRequest request,
		 *      HttpServletResponse response)
		 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("username");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");

		UsersDAO dao = new UsersDAO();
		Users users = new Users();

		users.setUsername(username);
		users.setEmailid(emailid);
		users.setPassword(password);

		dao.register(users);
		PrintWriter out = response.getWriter();
		out.println(username);

		response.sendRedirect("login.jsp");
	}

}
