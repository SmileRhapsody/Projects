<%-- 
    Document   : role
    Created on : 2019-4-14, 19:49:19
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Select Role</title>
    </head>
    <body>
        <div>
            <center><br/><br/><br/>
        <h1>Please Select the Role</h1><br/>
        <form action="choice.htm" method="post">
            <select name="type">
                <option value="Supplier">supplier</option>
                <option value="Sales">sales</option>
                <option value="Customer">customer</option>
            </select>
            <input type="hidden" name="page" value="role" />
            <input type="submit" name="submit" value="Submit" /><br/><br/><br/>
            <input type="submit" name="submit" value="Revenue Summary"/>
        </form>
            </center>
        </div>
    </body>
</html>
