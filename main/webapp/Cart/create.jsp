<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09/02/2023
  Time: 02:51 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p><a href="/CartServlet">Back to Cart List</a></p>
<form method="post">
    <fieldset>
        <legend>Create Cart</legend>
        <table>
            <tr>
                <td>ID :</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>CustomerId :</td>
                <td><input type="text" name="customerId"></td>
            </tr>
            <tr>
                <td>CartId :</td>
                <td><input type="text" name="cartId"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Create new Cart"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
