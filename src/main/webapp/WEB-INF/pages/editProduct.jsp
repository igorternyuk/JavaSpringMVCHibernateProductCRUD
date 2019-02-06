<%--
  Created by IntelliJ IDEA.
  User: zenko
  Date: 06.02.19
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/updateProduct">
        <input type="text" value="${product.id}" name="id" readonly><br>
        <input type="text" value="${product.name}" name="name" placeholder="name" required><br>
        <input type="text" value="${product.brand}" name="brand" placeholder="brand" required><br>
        <input type="number min=0" value="${product.price}" name="price" value='0' placeholder="price"><br>
        <input type="submit" name="btnUpdate" value="Update">
    </form>
    <a href="/products">Go back</a>
</body>
</html>
