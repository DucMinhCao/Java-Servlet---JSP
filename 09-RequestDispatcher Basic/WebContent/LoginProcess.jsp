<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Process</title>
</head>
<body>
	<%
		String name = request.getParameter("username");
		request.setAttribute("AttributeName", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		rd.forward(request, response);
	%>
</body>
</html>