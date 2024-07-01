package com.J1ggy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import main.webapp.Adapter;
import main.webapp.Item;

/**
 * Servlet implementation class LoadMenu
 */
@WebServlet("/LoadMenu")
public class LoadMenu extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadMenu() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int restaurant = Integer.parseInt(request.getParameter("restaurant"));

            Adapter adapter = new Adapter();
            ArrayList<Item> menuItems = adapter.loadMenu(restaurant);

            request.setAttribute("menuItems", menuItems);

            // Redirect to the appropriate JSP based on the restaurant choice
            switch (restaurant) {
                case 1:
                    request.getRequestDispatcher("BRUS.jsp").forward(request, response);
                    break;
                case 2:
                    request.getRequestDispatcher("SG.jsp").forward(request, response);
                    break;
                case 3:
                    request.getRequestDispatcher("CR.jsp").forward(request, response);
                    break;
                default:
                    response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid restaurant ID");
                    break;
            }
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid restaurant ID format");
        }
    }
}

