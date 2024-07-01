<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.util.*" %>
 <!--         THIS IS THE "VIEW" OR GUI, GRAHIC USER INTERFACE ( in this case a JSP based web site ) OF THE MVC       -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<%
    // Retrieve the current session or create one if it doesn't exist
    HttpSession s = request.getSession(true);

    // Retrieve the session counter attribute
    Integer sessionCounter = (Integer) s.getAttribute("sessionCounter");

    // If the session counter is null, initialize it to 1 (first visit)
    if (sessionCounter == null) {
        sessionCounter = 1;
    } else {
        // For subsequent visits, increment the session counter
        sessionCounter += 1;
    }

    // Store the updated session counter back in the session scope
    s.setAttribute("sessionCounter", sessionCounter);
%>
 <center>
      <p>Your session number is: <%= sessionCounter %></p>
</center>
<h1>Meals2Go Login</h1>
<h5>All your favourite restaurants...Delivered to your door</h5>
<br>
<center>    <!--Being a bit sloppy here - "<center>" is deprecated (Still works in most browsers LOL-->
<form action = "Authenticate" method ="post">  <!--  Note: the action "login" is the servlet mapping URL - See "web.xml"  - also - Note: method is Post-->
Enter First Name: <input type = "text" name = "fname"/>
Enter Last Name: <input type = "text" name = "lname"/>
Enter Password: <input type = "password" name = "password"/> 
<input type = "submit"/>
</form>
<br>
<br>
<img src="meals.jpg" alt="Meals to go" width="900" height="215">
<br>
<br>
<br>
<%
    // Retrieve the current hit counter value from the application scope
    Integer hitsCount = (Integer)application.getAttribute("hitCounter");

    // If the hit counter is null, initialize it to 1 (first visit)
    if (hitsCount == null || hitsCount == 0) {
        out.println("<b>Welcome to Meals2Go!</b>");
        hitsCount = 1;
    } else {
        // For subsequent visits, increment the hit counter
        out.println("<b>Hi " + request.getParameter("fname") + " Welcome back to Meals2Go!</b>");
        hitsCount += 1;
    }

    // Store the updated hit counter value back in the application scope
    application.setAttribute("hitCounter", hitsCount);
%>
<p>Total number of visits: <%= hitsCount %></p>
</center>
</body>
</html>