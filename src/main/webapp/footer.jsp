<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Footer</title>
</head>
<body>
<h2>
<%
	Date newDate = new Date();
	out.println(newDate.getDate());
%>
</h2>
</body>
</html>