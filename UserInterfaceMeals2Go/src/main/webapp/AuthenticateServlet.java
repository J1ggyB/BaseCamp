package main.webapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AuthenticateServlet
 */

@WebServlet("/Authenticate")
public class AuthenticateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String password = request.getParameter("password");

        Authentication auth = new Authentication();
        boolean isAuthenticated = auth.checkCredentials(firstName, lastName, password);

        if (isAuthenticated) {
            response.sendRedirect("success.jsp");
        } else {
            request.setAttribute("errorMessage", "Invalid credentials. Please try again.");
            request.getRequestDispatcher("RestaurantChoice.jsp").forward(request, response);
        }
    }
}
