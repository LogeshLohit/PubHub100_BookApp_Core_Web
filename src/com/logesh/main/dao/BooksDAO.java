
package com.logesh.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.logesh.main.model.Books;
import com.logesh.main.util.ConnectionUtil;

public class BooksDAO {

	public boolean modify(String newBookname, String oldBookname) {
		boolean flag = false;
		PreparedStatement pst = null;
		Connection connection = null;

		try {

			connection = ConnectionUtil.getConnection();

			String sql = "update books set bookname=? where bookname=?;";
			pst = connection.prepareStatement(sql);
			pst.setString(1, newBookname);
			pst.setString(2, oldBookname);
			int row = pst.executeUpdate();

			System.out.println("No. of rows updated: " + row);

			if (row > 0) {

				flag = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {if(pst!=null)
			{
			pst.close();
			}
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return flag;

	}

	public void save(Books books) {
		PreparedStatement pst = null;
		Connection connection = connection = ConnectionUtil.getConnection();

		try {

			

			String sql = "insert into  books(bookname,bookauthor,price) values (?,?,?);";
			pst = connection.prepareStatement(sql);
			pst.setString(1, books.getBookname());
			pst.setString(2, books.getBookauthor());
			pst.setInt(3, books.getPrice());
			pst.executeUpdate();
			System.out.println("No. of rows updated: ");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			if(pst!=null)
			{
			pst.close();
			}
			
		
			
			connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public boolean modifyByPrice(String bookname, int newprice) {
		boolean flag = false;
		PreparedStatement pst = null;
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();

			String sql = "update books set price=? where bookname=?;";
			pst = connection.prepareStatement(sql);
			pst.setInt(1, newprice);
			pst.setString(2, bookname);
			int row = pst.executeUpdate();
			System.out.println("No. of rows updated :" + row);

			if (row > 0) {

				flag = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pst!=null)
				{
				pst.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	public boolean removeById(int id) {
		boolean flag = false;
		PreparedStatement pst = null;
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();

			String sql = "delete from books where bookid=?;";
			pst = connection.prepareStatement(sql);
			pst.setInt(1, id);
			int row = pst.executeUpdate();

			if (row > 0) {

				flag = true;
			}

			System.out.println("No. of rows removed :" + row);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(pst!=null)
				{
				pst.close();
				}
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;

	}

	public List<Books> findAllBooksByLetterj() {
		List<Books> books = new ArrayList<>();
		PreparedStatement pst = null;
		Connection connection = null;

		try {
			connection = ConnectionUtil.getConnection();

			String sql = "select bookid,bookname,bookauthor,price from books where bookname like 'j%';";
			pst = connection.prepareStatement(sql);
			pst.executeQuery();

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Books book = new Books();
				book.setBookid(rs.getInt(1));
				book.setBookname(rs.getString(2));
				book.setBookauthor(rs.getString(3));
				book.setPrice(rs.getInt(4));
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				books.add(book);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pst!=null)
				{
				pst.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return books;

	}

	public List<Books> findAllBooks() {
		List<Books> books = new ArrayList<>();
		PreparedStatement pst = null;
		Connection connection = null;

		try {
			connection = ConnectionUtil.getConnection();

			String sql = "select bookid,bookname,bookauthor,price from books;";
			pst = connection.prepareStatement(sql);
			pst.executeQuery();

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Books book = new Books();
				book.setBookid(rs.getInt(1));
				book.setBookname(rs.getString(2));
				book.setBookauthor(rs.getString(3));
				book.setPrice(rs.getInt(4));
				// System.out.println(rs.getString(1));
				// System.out.println(rs.getString(2));
				books.add(book);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pst!=null)
				{
				pst.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return books;

	}

}
