<%-- 
    Document   : customerInterface
    Created on : 2019-4-18, 22:29:30
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer</title>
    </head>
    <body>
        <div> 
            <center><br/><br/><br/>
        <h1>Customer:${customerName} ID:${id}</h1><br/>
        <form action="customer.htm" method="post">
            <input type="hidden" name="customerName" value="${customerName}">
            <input type="submit" name="submit" value="Add Products"><br/><br/><br/>
            <input type="submit" name="submit" value="Browse Orders"><br/><br/><br/>
            <input type="submit" name="submit" value="Main Menu">
        </form>
            </center>
        </div>
    </body>
</html>
