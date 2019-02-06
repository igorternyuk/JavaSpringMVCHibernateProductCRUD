<%--
  Created by IntelliJ IDEA.
  User: zenko
  Date: 06.02.19
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<html>
<head>
    <title>Product details</title>
    <link href="../css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
    <table class="tg" border="1">
        <tr>
            <th>Parameter</th>
            <th>Value</th>
        </tr>
        <tr>
            <td>ID</td>
            <td>${product.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${product.name}</td>
        </tr>
        <tr>
            <td>Brand</td>
            <td>${product.brand}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${product.price}</td>
        </tr>
    </table>
    <a href="/products">Go to product list</a>
</body>
</html>
