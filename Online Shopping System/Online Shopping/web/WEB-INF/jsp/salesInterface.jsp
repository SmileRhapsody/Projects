<%-- 
    Document   : salesInterface
    Created on : 2019-4-18, 17:26:41
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sales</title>
    </head>
    <body>
        <div> 
            <center><br/><br/><br/>
        <h1>Sales:${salesName} ID:${id}</h1><br/>
        <form action="sales.htm" method="post">
            <input type="hidden" name="salesName" value="${salesName}">
            <input type="submit" name="submit" value="Add Products"><br/><br/><br/>
            <input type="submit" name="submit" value="Manage Products"><br/><br/><br/>
            <input type="submit" name="submit" value="View Revenue"><br/><br/><br/>
            <input type="submit" name="submit" value="Main Menu">
        </form>
            </center>
        </div>
    </body>
</html>
