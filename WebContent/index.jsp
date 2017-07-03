<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<br>
	<br> Hello
	<strong> <%
 	if (session != null) {
 		if (session.getAttribute("emailid") != null) {
 			String name = session.getAttribute("emailid").toString();
 			out.println(name);
 		} else {
 			response.sendRedirect("login.jsp");
 		}
 	}
 %>
	</strong>

	<h2>Book application</h2>
	<br>
	<br>

	<a href="savebook.jsp">Add new Book</a>
	<br>
	<br>
	<br>
	<a href="modifyprice.jsp">Modify Book by Price </a>
	<br>
	<br>
	<br>
	<a href="modify.jsp">Modify Book Name </a>
	<br>
	<br>
	<br>
	<a href="moveabook.jsp">Move / Delete a Book </a>
	<br>
	<br>
	<br>
	<a href="ShowAllBooksStartwithJ">List a book starts with 'j'</a>
	<br>
	<br>
	<br>
	<a href="ListAllBook">List all books</a>
	<br>
	<br>
	<form action="Logout">
		<input type="submit" value="logout" />
	</form>

</body>
</html>