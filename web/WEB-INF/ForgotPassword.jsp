<%-- 
    Document   : ForgotPassword
    Created on : Nov 21, 2017, 1:51:37 PM
    Author     : 578291
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Forgot Password</h1>
        <br>
        <form method="POST" action="forgot?action=email">
            Email Address: <input type="email" name="email">
            <input type="submit" name="submit">
        </form>
        <p>${message}</p>
    </body>
</html>
