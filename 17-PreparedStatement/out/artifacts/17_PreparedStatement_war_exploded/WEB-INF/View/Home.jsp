
<%--
  Created by IntelliJ IDEA.
  User: Minh Duc Cao
  Date: 8/19/2019
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<table border="1">
    <tr>
        <th>Username</th>
        <th>Password</th>
    </tr>
    <c:forEach items="${listAccount}" var="items">
        <tr>
            <td>${items.userName}</td>
            <td>${items.passWord}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
