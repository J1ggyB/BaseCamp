<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="indexPage.css">
<title>Welcome</title>
</head>
<body>
<header>
<h2>Welcome to Course Bookings:</h2>
<h2>Login:</h2>
</header>
<nav>
<ul>
<li> <a class = "active" href="index.jsp">Home</a> </li>
<li> <a class = "active" href="Registration.html">Registration</a> </li>
</ul>
</nav>
<main>
<form method = "post" action = "StudentLoginServletPath">
<label for="studentID">Student ID:</label>
<input type="text" id="studentID" name="studentID"> 
<label for="pin">PIN number:</label>
<input type="password" id="pin" name="pin"> <!--Hides the PIN  -->
<input type="Submit" value="Submit" />
</form>
</main>
</body>
</html>



