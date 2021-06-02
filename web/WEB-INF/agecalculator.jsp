<%-- 
    Document   : agecalculator
    Created on : Jun 2, 2021, 1:56:41 PM
    Author     : danny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form method="post" action="age">
            <h1>Age Calculator</h1>
            <label>Enter your age:</label>
            <input type="text" name="age" value="${age}">
            <br>
            <input type="submit" name="Age next birthday">
            <p>${message}</p>
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
