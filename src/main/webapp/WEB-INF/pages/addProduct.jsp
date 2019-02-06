<%--
  Created by IntelliJ IDEA.
  User: zenko
  Date: 06.02.19
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/saveProduct">
        <input type="text" name="name" placeholder="name" required><br>
        <input type="text" name="brand" placeholder="brand" required><br>
        <input type="number min=0" name="price" value='0' placeholder="price"><br>
        <input type="submit" name="btnAdd" value="Add">
    </form>
    <a href="/products">Go back</a>
</body>
</html>
