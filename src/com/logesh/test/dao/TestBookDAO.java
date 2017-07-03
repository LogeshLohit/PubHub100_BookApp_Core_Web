package com.logesh.test.dao;

import java.util.ArrayList;
import java.util.List;

import com.logesh.main.dao.BooksDAO;
import com.logesh.main.model.Books;

public class TestBookDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BooksDAO dao = new BooksDAO();
		Books books = new Books();
		/*List<Books> book=dao.findAllBooksStartwithj();
		
		System.out.println(book.get(0));
		*/
		
		/*books.setBookauthor("McKenzie");
		books.setBookname("Millonaire minds");
		books.setPrice(499);
		*/
		dao.findAllBooksByLetterj();
	//	System.out.println(books);
	}

}
