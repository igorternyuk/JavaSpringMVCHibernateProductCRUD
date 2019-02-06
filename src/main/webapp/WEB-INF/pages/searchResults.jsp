<%--
  Created by IntelliJ IDEA.
  User: zenko
  Date: 06.02.19
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>::: Search results :::</title>
    <link href="../css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
    <c:if test="${empty searchResult}">
        <h1>No matches found</h1>
    </c:if>
    <c:if test="${!empty searchResult}">
        <table class="tg" border="1">
        <c:forEach items="${searchResult}" var="product">
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
    </c:if>
    <a href="/products">Go back</a>
</body>
</html>
