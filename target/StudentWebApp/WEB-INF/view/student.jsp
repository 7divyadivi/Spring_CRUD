<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Student page 2</title>
</head>
<body>
<div align="center" >
    <a href="http://localhost:8777/StudentWebApp_war/showStudentPage ">
        <button aria-setsize="20" name="ADD">ADD</button>
    </a>
<table border="2">
    <thead>
    <tr>
    <td bgcolor="#dc143c">Id</td>
    <td bgcolor="#ff7f50">Name</td>
    <td bgcolor="#dc143c">Age</td>
    <td bgcolor="#ff7f50">Gender</td>
    <td bgcolor="#ff7f50">Fathers name</td>
    </tr>
    </thead>
<c:forEach var="student" items="${students}">
    <tr bgcolor="#cd5c5c">
    <td>${student.id}</td>
    <td>${student.name}</td>
    <td>${student.age}</td>
    <td>${student.gender}</td>
    <td>${student.fathersName}</td>
        <td><a href="/StudentWebApp_war/updateStudent?userId=${student.id}"/>Update</td>
        <td><a href="/StudentWebApp_war/deleteStudent?userId=${student.id}"onclick="!confirm('Are you sure you want to delete a student')"/>Delete</td>
    </tr>
</c:forEach>
</table>
</div>
</body>
</html>