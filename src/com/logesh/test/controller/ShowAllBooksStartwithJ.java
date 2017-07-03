package com.logesh.test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.logesh.main.dao.BooksDAO;
import com.logesh.main.model.Books;

/**
 * Servlet implementation class ShowAllBooksStartwithJ
 */
@WebServlet("/ShowAllBooksStartwithJ")
public class ShowAllBooksStartwithJ extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();

		BooksDAO dao = new BooksDAO();
		Books book = new Books();

		List<Books> books = dao.findAllBooksByLetterj();

		if (books.size() > 0) 
		{
			RequestDispatcher rd = request.getRequestDispatcher("startswithj.jsp");
			request.setAttribute("book", books);
			rd.forward(request, response);
		} 
		else
		{
			out.print("no record found");
		}
		/*
		 * String homelink="index.html"; out.println("!</bold><br><br>");
		 * out.println("<a href="+ homelink +">Home page</a>");
		 */
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
