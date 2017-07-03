package com.logesh.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.logesh.main.dao.BooksDAO;
import com.logesh.main.model.Books;

/**
 * Servlet implementation class TestBooksDAOMove
 */
@WebServlet("/TestBooksDAOMove")
public class TestBooksDAOMove extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		Integer id = Integer.parseInt(request.getParameter("id"));

		BooksDAO dao = new BooksDAO();
		Books books = new Books();

		if (dao.removeById(id))

		{
			out.println("Book successfully deleted " + id);

		} else {
			out.println("Sorry that Book Id is not available ! please retry");
		}

		String homelink = "index.html";
		out.println("!</bold><br><br>");
		out.println("<a href=" + homelink + ">Home page</a>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
