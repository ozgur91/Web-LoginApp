<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<jsp:include page="head.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>You are logged in</title>
</head>
<body>
	<h3>You are Logged in welcome to our new Page</h3>

	<%
	String username = request.getParameter("username");
	if(username!=null)
	out.println("Welcome "+username);
	%>
	
	

</body>
</html>