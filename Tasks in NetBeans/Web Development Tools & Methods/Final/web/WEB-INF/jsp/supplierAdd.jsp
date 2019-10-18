<%-- 
    Document   : supplierBrowse
    Created on : 2019-4-15, 16:47:16
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
        <h1>Please Enter Product Information</h1><br/>
        <form action="supplier.htm" method="post">
            Product Name: <input type="text" name="name"/><br/><br/>
            Product Price: <input type="text" name="price"/><br/><br/>
            Product Count: <input type="text" name="count"/><br/><br/>
            <input type="hidden" name="supplierName" value="${supplierName}"/><br/><br/>
            <input type="submit"  name="submit" value="Add" />
        </form>
            </center>
        </div>
    </body>
</html>
