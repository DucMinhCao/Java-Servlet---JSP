<%--
  Created by IntelliJ IDEA.
  User: Minh Duc Cao
  Date: 8/20/2019
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <style>
        div {
            width: 50%;
            text-align: left;
            margin: 15px auto 20px auto;
        }
        p {
            margin: auto;
            width: 50%;
        }
    </style>
</head>
<body>
<form action="QuizController" method="POST">
    <c:forEach items="${list}" var="items">
        <p>${items.id}. ${items.question}</p>
        <div>
            <input type="radio" name="${items.id}" value="A">${items.option1}
            <br>
            <input type="radio" name="${items.id}" value="B">${items.option2}
            <br>
            <input type="radio" name="${items.id}" value="C">${items.option3}
            <br>
            <input type="radio" name="${items.id}" value="D">${items.option4}
        </div>
    </c:forEach>
    <br>
    <input type="submit" value="TabScript">
</form>
</body>
</html>
