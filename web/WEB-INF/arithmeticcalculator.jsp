<%-- 
    Document   : arithmeticcalculator
    Created on : Jun 2, 2021, 2:26:06 PM
    Author     : danny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form method="post" action="arithmetic">
            <h1>Arithmetic Calculator</h1>
            <label>First: </label>
            <input type="text" name="first_number" value="${firstNumber}">
            <br>
            <label>Second: </label>
            <input type="text" name="last_number" value="${lastNumber}">
            <br>
            <input type="submit" name="operator" value="+">
            <input type="submit" name="operator" value="-">
            <input type="submit" name="operator" value="*">
            <input type="submit" name="operator" value="%">
        </form>
            <p>Result: <span>${result}</span></p>
            <a href="age">Age Calculator</a>

    </body>
</html>
