<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "Mypack.Users" %>
<%@page import = "Mypack.DAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		
		request.setAttribute("ListUser", DAO.ExportUsers());
		RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
		rd.forward(request, response);
	%>
</body>
</html>