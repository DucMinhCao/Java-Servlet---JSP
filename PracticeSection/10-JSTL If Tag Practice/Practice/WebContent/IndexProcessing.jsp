<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Mypack.StudentList"%>
<%@ page import="Mypack.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("StudentList", StudentList.getAllStudent());
		RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
		rd.forward(request, response);
	%>
</body>
</html>