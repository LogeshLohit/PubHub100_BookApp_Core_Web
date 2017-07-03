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
 * Servlet implementation class TestBooksDAOModifyPrice
 */
@WebServlet("/TestBooksDAOModifyPrice")
public class TestBooksDAOModifyPrice extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		
		String bookname = request.getParameter("bookname");
		Integer newprice = Integer.parseInt(request.getParameter("newprice"));

		BooksDAO dao = new BooksDAO();
		Books books = new Books();

		if (dao.modifyByPrice(bookname, newprice)) 
		{
			out.println("Book price of " + bookname + " is set to " + newprice);
		} 
		else
		{
			out.println("Sorry book name you entered is not available ! Please retry.");
		}

		String homelink = "index.html";
		out.println("!<br><br>");
		out.println("<a href=" + homelink + ">Home page</a>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}
}
