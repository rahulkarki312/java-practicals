<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <h1>Student Input Form</h1>
    <form action="Display.jsp" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>
        <label for="course">Course:</label>
        <input type="text" id="course" name="course" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
