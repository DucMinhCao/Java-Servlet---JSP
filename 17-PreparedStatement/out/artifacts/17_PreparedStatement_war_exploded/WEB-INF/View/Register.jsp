<%--
  Created by IntelliJ IDEA.
  User: Minh Duc Cao
  Date: 8/19/2019
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Page</title>
</head>
<body>
<h4><%= request.getAttribute("RegisterMessage") == null ? "" : request.getAttribute("RegisterMessage")%>
</h4>
<form method="POST" action="RegisterController">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
