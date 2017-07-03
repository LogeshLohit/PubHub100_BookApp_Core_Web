<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	Welcome to Logesh Application See all books !
	<br>
	<br>
	<br>

	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>BOOKNAME</th>
				<th>BOOKAUTHOR</th>
				<th>BOOKPRICE</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${books}</td>
			</tr>

			<c:forEach var="book" items="${book}">
				<tr>
					<td>${book.bookid}</td>
					<td>${book.bookname}</td>
					<td>${book.bookauthor}</td>
					<td>${book.price}</td>
				</tr>

			</c:forEach>

		</tbody>

	</table>


	<%
		String homelink = "index.html";
		out.println("</bold><br><br>");
		out.println("<a href=" + homelink + ">Home page</a>");
	%>


</body>
</html>