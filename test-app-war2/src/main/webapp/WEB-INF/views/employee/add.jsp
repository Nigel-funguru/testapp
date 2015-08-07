<%--
  Created by IntelliJ IDEA.
  User: Nigel
  Date: 2015-08-03
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head>
        <title>Add Employee</title>
    </head>
    <body>
        <h1>Add new Employee:</h1>
        <form:form action="/employee/save" commandName="employeeFormObject" method="post">
            <table>
                <tr>
                    <td><form:label path="firstName">First Name</form:label></td>
                    <td><form:input path="firstName"/></td>
                </tr>
                <tr>
                    <td><form:label path="lastName">Last Name</form:label></td>
                    <td><form:input path="lastName"/></td>
                </tr>
                <tr>
                    <td><form:label path="empNumber">Employee Number</form:label></td>
                    <td><form:input path="empNumber"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>

        </form:form>
    </body>
</html>
