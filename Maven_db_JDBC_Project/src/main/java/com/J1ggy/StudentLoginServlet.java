package com.J1ggy;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 //Servlet implementation class studentLoginServlet
 */
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentID = Integer.parseInt(request.getParameter("studentID"));
		int pin = Integer.parseInt(request.getParameter("pin"));
		HttpSession session = request.getSession();
		session.setAttribute("sessionStudentID", studentID);
		session.setAttribute("sessionPIN", pin);
		LoginBean loginBean = new LoginBean();
		loginBean.setStudentID(studentID);
		loginBean.setPin(pin);
		LoginDao loginDao = new LoginDao();

			try {
				if (loginDao.validate(loginBean)){
				response.sendRedirect("LoginSuccess.jsp");
				}
				else {
					response.sendRedirect("index.jsp");	
				}
			} catch (SQLException | IOException e) {
				e.printStackTrace();
				System.out.println(e);
			}

	}
}