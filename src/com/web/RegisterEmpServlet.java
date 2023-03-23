package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EmpDAO.EmployeeDAO;
import com.model.Employee;

@WebServlet("/RegisterEmpServlet")
public class RegisterEmpServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String empName = request.getParameter("empName");
		String gender = request.getParameter("gender");
		double salary = Double.valueOf(request.getParameter("salary"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Employee employee=new Employee(0,empName,salary,gender,email,password);
		
		EmployeeDAO employeeDAO=new EmployeeDAO();
		int res= employeeDAO.registerEmployee(employee);

		if (res >= 1) {
			
			out.print("<h3 style='color:blue'>Registration Success</h3>");			
		} else {
			
			System.out.println("<h3 style='color:red'>Error");	
		}
		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
