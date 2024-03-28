package com.J1ggy;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentLoginDetails
 */
public class StudentLoginDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html"); //Set the content type of your response
			String Email = request.getParameter("email");
			String postcode = request.getParameter("postcode");
		    String result = ""; ///Declare a String to hold the result
		    StudentLoginDetailsDao sDao = new StudentLoginDetailsDao();
				try {//try to send the Student instance to the RegisterDao for insertion into the DBase
					result = sDao.getDetails(Email,postcode); //Call insert() method of rDao and assign to result
					 response.getWriter().print(result);//Create a PrintWriter to send html response of result
				} catch (SQLException e) {//catch any error
					e.printStackTrace();////Stores the exception as a String

				}

	}

}
