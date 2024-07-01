<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to The Summer Garden</title>
</head>
<body>
<h3>Welcome to The Sumer Garden</h3>
<img src="SG.jpg" alt="The Summer Garden" width="75" height="75">
<h3>The Summer Garden Menu</h3>
    <ul>
        <c:forEach items="${menuItems}" var="item">
            <li>${item.id} </li>
            <li><b>${item.name} </b></li>
            <li>${item.price}</li>
            <li>${item.description}</li>
            <li>${item.recommendations}</li>
            <li>${item.options}</li>
			<br>
        </c:forEach>
    </ul>
    <style>ul { list-style-type: none;}</style>
</body>
</html>