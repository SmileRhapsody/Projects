<%-- 
    Document   : part7
    Created on : 2019-2-10, 21:15:18
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="transfer" method="post">
        <h2>Welcome to Our Movie Store</h2>
        <h2>Please Make Your Selection Below</h2><br/>
        <select name="selection">
            <option value="Browse Movies">Browse Movies</option>
            <option value="Add New Movies to Database">Add New Movies to Database</option>
        </select>
        <input type="submit" value="Send" />
        </form>
    </body>
</html>
