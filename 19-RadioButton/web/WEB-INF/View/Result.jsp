<%--
  Created by IntelliJ IDEA.
  User: Minh Duc Cao
  Date: 8/20/2019
  Time: 10:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${rightAnswer}" var="items">
        <c:forEach items="${userAnswer}" var="userAnswerItems">
            <c:if test="${items == 'A'}">
                ${items.option1}
                <br>
                ${items.option2}
                <br>
                ${items.option3}
                <br>
                ${items.option4}
            </c:if>
            <c:if test="${items == 'B'}">

            </c:if>
            <c:if test="${items == 'C'}">

            </c:if>
            <c:if test="${items == 'D'}">

            </c:if>
        </c:forEach>
    </c:forEach>
</body>
</html>
