<%-- 
    Document   : part5_book
    Created on : 2019-2-9, 21:53:56
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book</title>
    </head>
    <body>
        <form action="part5" method="post">
            <h1><center>Shop for Books</center></h1>
            <hr />
            <p align="right"><a href="part5_cart.jsp">View Cart</a></p><br/>
            <input type="checkbox" name="book" value="Java Servlet Programming">
            Java Servlet Programming [$29.95]<br/>
            <input type="checkbox" name="book" value="Oracle Database Programming">
            Oracle Database Programming [$48.95]<br/>
            <input type="checkbox" name="book" value="System Analysis and Design With UML">
            System Analysis and Design With UML [$14.95]<br/>
            <input type="checkbox" name="book" value="Object Oriented Software Engineering">
            Object Oriented Software Engineering [$35.99]<br/>
            <input type="checkbox" name="book" value="Java Web Services">
            Java Web Services [$27.99]<br/>
            <p><center><input type="submit" value="Add to Chart"></center>
        </form>
    </body>
</html>
