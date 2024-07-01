<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to The Cafe Roma</title>
</head>
<body>
<h3>Welcome to The Cafe Roma</h3>
<img src="CR.jpg" alt="The Cafe Roma" width="75" height="75">
<h3>The Cafe Roma Menu</h3>
    <ul>
        <c:forEach items="${menuItems}" var="item">
            <li>${item.item} </li>
            <li><b>${item.dish} </b></li>
            <li><b>${item.price}</b></li>
            <li>${item.description}</li>
            <li>${item.options}</li>
            <li>${item.separator}</li>
            <br>
        </c:forEach>
    </ul>
        <style>ul { list-style-type: none;}</style>
</body>
</html>