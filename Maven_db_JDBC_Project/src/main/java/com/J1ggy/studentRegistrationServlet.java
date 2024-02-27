package com.J1ggy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class studentRegistrationServlet
 */
public class studentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");
	      String firstName = request.getParameter("firstName");
	      String lastName = request.getParameter("lastName");
	      String email = request.getParameter("email");	      
	      int houseNumber = Integer.parseInt(request.getParameter("houseNumber"));
	      String postcode = request.getParameter("postCode");
	      Student student = new Student(firstName, lastName, email, houseNumber, postcode);
	      RegisterDao rDao = new RegisterDao();
	      String result;
		try {
			result = rDao.insert(student);
			 response.getWriter().print(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	     
	}
	

}
