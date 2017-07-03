package com.logesh.test.model;

import com.logesh.main.model.Books;

public class TestBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books books=new Books();
		
		books.setBookauthor("Rudyard Kipling");
		books.setBookid(123);
		books.setBookname("The Jungle Book");
		books.setPrice(399);
		
		System.out.println(books);
	}

}
