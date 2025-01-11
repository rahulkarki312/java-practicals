<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Example</title>
</head>
<body>
    <h1>Scriptlet, Declaration, and Expression Example</h1>

    <% 
        // Scriptlet tag
        int number = 10; 
    %>
    <p>Scriptlet Value: <%= number %></p>

    <%! 
        // Declaration tag
        public String getMessage() {
            return "Hello from Declaration!";
        }
    %>
    <p>Declaration Value: <%= getMessage() %></p>

    <%= "Expression Tag Value: " + (number * 2) %> <!-- Expression Tag -->
</body>
</html>
