<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow" text="blue">
				
		<% String emailId = (String) session.getAttribute("email"); %>
		
		<h3> Welcome: <%= emailId %>!</h3>
		<form align='right'><a href='Login.html' script='right:10px; top:0px;'> Logout </a></form>
		
		<center>		
		<h1> Welcome to Hr Home Page </h1>
		<h3> <a href='AllEmployees'> GetEmployees </a>  &nbsp; &nbsp; &nbsp;
		<a href='GetEmpById.jsp'> GetEmployeeById </a> </h3>
		</center>
		
</body>
</html>