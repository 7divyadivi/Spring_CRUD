<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Student page</title>
</head>
<body>
<div>
<h1 align="center">Student Details</h1>
    <div align="center">
    <a href="http://localhost:8777/StudentWebApp_war/showStudent"/>
        <button aria-setsize="20" name="show">Show List</button>
    </a>
    </div>
<table>
<c:forEach var="student" items="${students}">
    ${students.Id}
    ${students.Name}
    ${students.Age}
    ${student.Gender}
    ${student.fathersName}
</c:forEach>
</table>
</div>
</body>
</html>