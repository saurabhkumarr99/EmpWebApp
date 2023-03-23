<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>

	<jsp:include page="EmployeeHomePage.jsp" />

		<center>
			<table>

			<tr align=center>
			<th> EmpId    </th>
			<th> Name     </th>
			<th> Salary   </th>
			<th> Gender   </th>
			<th> Email-Id </th>
			<th> Actions </th>
			</tr>

			<tr>
			<td> ${ currEmpl.empId    } </td>
			<td> ${ currEmpl.empName  } </td>
			<td> ${ currEmpl.salary   } </td>
			<td> ${ currEmpl.gender   } </td>
			<td> ${ currEmpl.emailId  } </td>
			<td> <a href="UpdateProfile.jsp"> Edit </a> </td>
			</tr>

			</table>

		</center>
</body>
</html>