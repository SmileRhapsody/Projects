<%-- 
    Document   : supplierSuccess
    Created on : 2019-4-8, 21:14:22
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supplier</title>
    </head>
    <body>
        <div> 
            <center><br/><br/><br/>
        <h1>Supplier: ${supplierName} ID: ${id}</h1><br/>
        <form action="supplier.htm" method="post">
            <input type="hidden" name="supplierName" value="${supplierName}">
            <input type="submit" name="submit" value="Add Products"><br/><br/><br/>
            <input type="submit" name="submit" value="View Products"><br/><br/><br/>
            <input type="submit" name="submit" value="Main Menu">
        </form>
            </center>
        </div>
    </body>
</html>
