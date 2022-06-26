<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
<h2>Add Student</h2>
<%--@elvariable id="student" type=""--%>
<form:form action="save-student" modelAttribute="student" method="GET">
    <form:hidden path="id"/>
<label>Name:</label>
<form:input path="name"/>
    <br/>
    <label>Age:</label>
    <form:input path="age"/>
    <br/>
    <label>Fathers name:</label>
    <form:input path="fathersName"/>
    <br/>
    <input type="radio" name="gender" value="Female">
    <label>Female</label>
    <input type="radio" name="gender" value="Male">
    <label>Male</label>
    <input type="radio" name="gender" value="Other">
    <label>Other</label>
    <br/>
    <input type="submit" value="Submit">
</form:form>
</div>
</body>
</html>