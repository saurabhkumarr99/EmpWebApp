package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EmpDAO.EmployeeDAO;
import com.db.MyConnection;
import com.model.Employee;

@WebServlet("/AllEmployees")
public class AllEmployees extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		EmployeeDAO empDAO = new EmployeeDAO();
		ArrayList<Employee> empList = empDAO.getEmployees();

		if (empList != null) {

			request.setAttribute("empList", empList);

			RequestDispatcher rd = request.getRequestDispatcher("GetAllEmployees.jsp");
			rd.forward(request, response);

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("HRHomePage.jsp");
			rd.include(request, response);

			out.print("<center>");
			out.print("<h1 style='color:red;'> Employee Record(s) Not Found!!! </h1>");
			out.print("</center>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
