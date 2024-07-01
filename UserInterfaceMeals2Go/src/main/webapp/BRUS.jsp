
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page	import = "java.util.ArrayList"	%>
<%@ page	import = "java.util.Iterator"	%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>BurgersRUs Menu</title>
</head>
<body>
<h4>Welcome to BurgersRUs</h4>
<img src="BRUS.jpg" alt="BurersRUs" width="75" height="75">
    <h2><b>BurgersRUs Menu</b></h2>
    <ul>
        <c:forEach items="${menuItems}" var="item">
            <li>${item.name} </li>
            <li>${item.price}</li>
            <li>${item.mealPrice} </li>
            <li>${item.calories} </li>
            <li>${item.mealCalories} </li>
            <li>${item.description}</li>
            <li>${item.recommendations}</li>
            <li>${item.options}</li>
            <li>${item.separator}</li>
        </c:forEach>
    </ul>
        <style>ul { list-style-type: none;}</style>
</body>
</html>


