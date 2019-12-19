<%--
  Created by IntelliJ IDEA.
  User: anld
  Date: 12/19/2019
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>view list customer</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>CustomerName</th>
        <th>ContactName</th>
        <th>phone</th>
        <th>City</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="item" items="${viewListCustomer}">
    <tr>

        <td><c:out value="item.id"/></td>
        <td><c:out value="item.customerName"/></td>
        <td><c:out value="item.contactLastName"/></td>
        <td><c:out value="item.phone"/></td>
        <td><c:out value="item.city"/></td>

    </tr>
    </c:forEach>
    </tbody>


</table>

</body>
</html>
