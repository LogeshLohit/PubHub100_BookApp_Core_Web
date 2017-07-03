package com.logesh.test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.logesh.main.dao.UsersDAO;
import com.logesh.main.model.Users;

/**
 * Servlet implementation class UsersLogin
 */
@WebServlet("/UsersLogin")
public class UsersLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsersLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		/*
		 * String emailid=request.getParameter("emailid"); String
		 * password=request.getParameter("password");
		 * 
		 * UsersDAO dao = new UsersDAO(); Users users = new Users();
		 * 
		 * dao.login(emailid,password); PrintWriter out=response.getWriter();
		 * out.println("welcome !");
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");

		UsersDAO dao = new UsersDAO();
		Users users = new Users();

		PrintWriter out = response.getWriter();
		try {
			if (dao.login(emailid, password))

			{
				HttpSession session = request.getSession();
				session.setAttribute("emailid", emailid);
				System.out.println("Email of user:" + emailid);
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);

			} else {
				response.sendRedirect("loginfail.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String homelink = "index.html";
		out.println("!</bold><br><br>");
		out.println("<a href=" + homelink + ">Home page</a>");

	}

}
