<%--
  Created by IntelliJ IDEA.
  User: Nigel
  Date: 2015-08-03
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>Employee - Success</title>
    </head>
    <body>
        <h1>Added new Employee</h1>
        <c:forEach items="${employees}" var="employee">
            <div>
                <span>${employee.firstName}, ${employee.lastName}  :: ${employee.empNumber}</span>
            </div>
        </c:forEach>
    </body>
</html>
