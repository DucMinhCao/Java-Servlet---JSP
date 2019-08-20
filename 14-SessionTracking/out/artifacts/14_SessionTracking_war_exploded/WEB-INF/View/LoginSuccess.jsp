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
    <title>Login Success Page</title>
</head>
<body>
    <h1>Welcome <%= session.getAttribute("session")%></h1>
    <form action="LogoutServlet" method="POST">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
