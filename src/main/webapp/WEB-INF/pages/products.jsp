<%--
  Created by IntelliJ IDEA.
  User: zenko
  Date: 06.02.19
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>::: Products :::</title>
    <link href="../css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
    <h1>Product list</h1>
<c:if test="${!empty listProducts}">
    <table class="tg" border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Edit</th>
            <th>Remove</th>
        </tr>
        <c:forEach items="${listProducts}" var="product">
            <tr>
                <td>${product.id}</td>
                <td><a href="/productDetails/${product.id}">${product.name}</a></td>
                <td>${product.brand}</td>
                <td>$${product.price}</td>
                <td><a href="<c:url value='/edit/${product.id}'/>">Edit</a></td>
                <td><a href="<c:url value='/remove/${product.id}'/>">Remove</a></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <form action="/find" method="get">
        <input type="text" name="searchFilter">
        <input type="submit" name="btnFind" value="Find">
    </form>
</c:if>
<a href="/addProduct">Add product</a>
<br>
<a href="/">Go back</a>
</body>
</html>



