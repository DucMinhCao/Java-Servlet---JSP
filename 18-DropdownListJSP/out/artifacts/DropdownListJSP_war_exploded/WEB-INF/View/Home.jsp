<%--
  Created by IntelliJ IDEA.
  User: Minh Duc Cao
  Date: 8/20/2019
  Time: 8:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="HomeController" method="POST">
        <select>
            <c:forEach items="${list}" var="item">
                <option value="${item.id}">${item.name}</option>
            </c:forEach>
        </select>
    </form>
</body>
</html>
