<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="border: 2px solid #000000; border-collapse: collapse;">
		<c:forEach items="${StudentList}" var="Items">
			<c:if test="${Items.gpa > 7 }">
				<tr>
					<td>${Items.name}</td>
					<td>${Items.gender}</td>
					<td>${Items.address}</td>
					<td>${Items.gpa}</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>
</body>
</html>