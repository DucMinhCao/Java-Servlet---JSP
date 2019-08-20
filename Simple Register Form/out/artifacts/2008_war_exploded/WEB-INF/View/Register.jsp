<%--
  Created by IntelliJ IDEA.
  User: Minh Duc Cao
  Date: 8/20/2019
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        body {
            font-family: sans-serif;
            font-size: 1rem;
        }

        div {
            margin-top: 1em;
        }

        fieldset {
            border:1px solid black;
            margin: 10px;
        }

        form {
            margin: 0 auto;
            width: 70%;
            padding: 1em;
            border:1px solid black;

        }
    </style>
</head>
<body>
<p style="text-align: center">Application For Permission To Date My Daughter</p>
<p>Note: Form is to be completed at least 21 days prior to date</p>
<p><%= request.getAttribute("message") != null ? request.getAttribute("message") : ""%></p>
<form action="RegisterController" method="post">
    <fieldset>
        <legend>Personal Details</legend>
        <div>
            <label for="name" id="name-label">Name: </label>
            <input type="text" placeholder="Enter name here" name="username" required id="name">
        </div>
        <div>
            <label for="address" id="address-label">Address: </label>
            <input type="text" name="address" required id="address" placeholder="Enter address here">
        </div>
        <div>
            <label for="email" id="email-label">Email: </label>
            <input type="text" name="email" id="email" placeholder="Enter email here">
        </div>
        <div>
            <label for="phone" id="phone-label">Phone: </label>
            <input type="text" name="phone" id="phone" placeholder="Enter 10 digit number">
        </div>
        <div>
            <label for="province">Province: </label>
            <form action="ForwardController" method="GET" id="province">
                <select name="selectedProvince">
                    <c:forEach items="${list}" var="items">
                        <option value="${items.name}">${items.name}</option>
                    </c:forEach>
                </select>
            </form>
        </div>
        <input type="submit" value="SUBMIT">
    </fieldset>
</form>
</body>
</html>
