<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<body>
    <h1>Student Details</h1>
    <p><strong>Name:</strong> <%= request.getParameter("name") %></p>
    <p><strong>Age:</strong> <%= request.getParameter("age") %></p>
    <p><strong>Course:</strong> <%= request.getParameter("course") %></p>
</body>
</html>
