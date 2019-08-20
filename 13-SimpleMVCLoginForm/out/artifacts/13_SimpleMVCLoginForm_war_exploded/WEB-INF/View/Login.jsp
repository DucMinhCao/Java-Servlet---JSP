<%--
  Created by IntelliJ IDEA.
  User: Minh Duc Cao
  Date: 8/18/2019
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h5><%= request.getAttribute("FailedMessage") != null ? request.getAttribute("FailedMessage") : "" %></h5>
    <form action="LoginServlet" method="POST">
        <input type="text" name="username"/>
        <br>
        <input type="password" name="password"/>
        <br>
        <input type="submit" value="Login"/>
    </form>
</body>
</html>
