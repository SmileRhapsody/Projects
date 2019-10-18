<%-- 
    Document   : part7_login
    Created on : 2019-2-11, 11:53:21
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form method="POST" action="j_security_check">
            <center>
                <h1>Please Enter Admin Username And Password</h1><br/>
                <table border="0">
                    <tr/><td/>Login
                    <td/><input type="text" name="j_username" />
                    <tr/><td/><td/>
                    <tr/><td/>Password
                    <td/><input type="password" name="j_password" />
                </table><br/>
                <p><input type="submit" value="Login!">
            </center>
        </form>
    </body>
</html>
