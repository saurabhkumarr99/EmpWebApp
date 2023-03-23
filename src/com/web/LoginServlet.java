package com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.EmpDAO.EmployeeDAO;
import com.model.Employee;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		session.setAttribute("email", email);

		if (email.equals("HR") && password.equals("hr")) {
			
			RequestDispatcher rd = request.getRequestDispatcher("HRHomePage.jsp");
			rd.forward(request, response);

		} else {

			EmployeeDAO empDAO = new EmployeeDAO();
			Employee emp = empDAO.getEmployee(email, password);

			if (emp != null) {
				
				session.setAttribute("currEmpl", emp);

				RequestDispatcher rd = request.getRequestDispatcher("EmployeeHomePage.jsp");
				rd.forward(request, response);

			} else {
				out.print("<html>");
				out.print("<body>");
				out.print("<center>");
				out.print("<h1 style='color:red'> Invalid Credentials!! </h1>");
				out.print("</center>");
				out.print("</body>");
				out.print("</html>");
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
