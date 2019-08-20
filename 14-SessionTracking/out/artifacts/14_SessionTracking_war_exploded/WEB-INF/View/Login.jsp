<%--
  Created by IntelliJ IDEA.
  User: Minh Duc Cao
  Date: 8/18/2019
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h4><%= request.getAttribute("FailedMessage") != null ? request.getAttribute("FailedMessage") : ""%></h4>
    <form action="LoginServlet" method="POST">
        <input type="text" name="username"/>
        <input type="text" name="password"/>
        <input type="submit" value="Login"/>
    </form>
</body>
</html>
