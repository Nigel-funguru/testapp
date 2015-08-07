<%--
  Created by IntelliJ IDEA.
  User: Nigel
  Date: 2015-07-30
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>HOME2</title>
    </head>
    <body>
        <h1>TestApp - HOME2</h1>
        <c:forEach items="${employees}" var="employee">
            <div>
                <span>${employee.firstName}, ${employee.lastName}  :: ${employee.empNumber}</span>
            </div>
        </c:forEach>
        <a href="/employee/add">Add Employee</a>
    </body>
</html>
