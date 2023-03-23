
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UpdateEmployee</title>
</head>
<body>
	<jsp:include page="EmployeeHomePage.jsp" />

	<form action="UpdateProfile" method="post" align="center">
		<center>
			<h3>Update Profile</h3>

			<table>
				<tr>
					<td align="right">EmpId</td>
					<td align="left"><input type="text" name="empId"
						value="${currEmpl.empId}" readonly /></td>
				</tr>

				<tr>
					<td align="right">Name</td>
					<td align="left"><input type="text" name="empName"
						value="${currEmpl.empName}" /></td>
				</tr>

				<tr>
					<td align="right">Salary</td>
					<td align="left"><input type="text" name="salary"
						value="${currEmpl.salary}" readonly /></td>
				</tr>
				<tr>
					<td align="right">Gender</td>
					<td align="left"><input type="text" name="gender"
						value="${currEmpl.gender}" /></td>
				</tr>

				<tr>
					<td align="right">Email-Id</td>
					<td align="left"><input type="text" name="emailId"
						value="${currEmpl.emailId}" readonly /></td>
				</tr>

				<tr>
					<td align="right">Password</td>
					<td align="left"><input type="text" name="password"
						value="${currEmpl.password}" /></td>
				</tr>

				<tr>
					<td></td>
					<td align="left"><input type="submit" value="UpdateProfile" />
					</td>
				</tr>

			</table>
		</center>
	</form>
</body>
</html>