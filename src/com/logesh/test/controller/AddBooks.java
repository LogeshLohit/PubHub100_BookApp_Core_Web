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
 * Servlet implementation class AddBooks
 */
@WebServlet("/AddBooks")
public class AddBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddBooks() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bookname = request.getParameter("bookname");
		String bookauthor = request.getParameter("bookauthor");
		Integer price = Integer.parseInt(request.getParameter("price"));

		BooksDAO dao = new BooksDAO();
		Books books = new Books();

		books.setBookname(bookname);
		books.setBookauthor(bookauthor);
		books.setPrice(price);

		dao.save(books);
		PrintWriter out = response.getWriter();
		out.println("Bookname:" + bookname + "Book author:" + bookauthor + "Book Price:" + price);

		String homelink = "index.html";
		out.println("!<br><br>");
		out.println("<a href=" + homelink + ">Home page</a>");

	}

}
