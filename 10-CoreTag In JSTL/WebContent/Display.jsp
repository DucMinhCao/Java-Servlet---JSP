<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="border: solid 1px #000000; border-collapse: collapse;">
		<c:forEach items="${ListUser}" var="items">
			<tr>
				<td>${items.name}</td>
				<td>${items.work}</td>
				<td>${items.address}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>