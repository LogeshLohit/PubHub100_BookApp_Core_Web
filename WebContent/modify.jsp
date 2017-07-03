<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify Book Name here !</title>
</head>
<body>
	<h3>
		<center>Welcome to Logesh Book Application Modify book name</center>
	</h3>
	<form action="TestBooksDAOModify" method="post">
		Enter the book name you want to modify:<input type="text"
			name="oldname" /><br>
		<br> Enter the new book name:<input type="text" name="newname" /><br>
		<br> <input type="submit" name="submit" value="Edit Book name" />
	</form>
</body>
</html>