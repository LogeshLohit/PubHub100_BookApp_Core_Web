package com.logesh.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.logesh.main.dao.BooksDAO;
import com.logesh.main.model.Books;

/**
 * Servlet implementation class TestBooksDAOModify
 */
@WebServlet("/TestBooksDAOModify")
public class BooksModifyByName extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
/*		PrintWriter out = response.getWriter();
		String oldBookname = request.getParameter("oldname");
		String newBookname = request.getParameter("newname");

		BooksDAO dao = new BooksDAO();
		Books books = new Books();

		boolean a = dao.modify(newBookname, oldBookname);
		System.out.println(a);

		out.println("Book name successfully modifid from \t " + oldBookname + " \t to" + newBookname);*/

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String oldBookname = request.getParameter("oldname");
		String newBookname = request.getParameter("newname");

		BooksDAO dao = new BooksDAO();
		Books books = new Books();

		if (dao.modify(newBookname, oldBookname)) {
			out.println("Book name successfully modifid from \t " + oldBookname + " \t to" + newBookname);
		} else {
			out.println("Sorry your input book not available ! try again");
		}

		String homelink = "index.html";
		out.println("!</bold><br><br>");
		out.println("<a href=" + homelink + ">Home page</a>");
	}

}
