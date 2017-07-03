<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<center>Welcome to Logesh Book Application Users Registration</center>
	<form action="UsersRegistration" method="post">
		Enter your name:<input type="text" name="username" /><br>
		<br> Enter emailid:<input type="email" name="emailid" /><br>
		<br> Enter password:<input type="password" name="password" /><br>
		<br> <input type="submit" name="submit" value="Register" />
	</form>

</body>
</html>