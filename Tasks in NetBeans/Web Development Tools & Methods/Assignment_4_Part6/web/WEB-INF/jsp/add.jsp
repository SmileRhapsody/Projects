<%-- 
    Document   : part7_add
    Created on : 2019-2-10, 21:33:56
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add</title>
    </head>
    <body>
        <form action="movieadd.htm">
        <div><h1>Please enter the details below</h1></div>
        <p>Movie Title: <input type="text" name="title"></p>
        <p>Lead Actor: <input type="text" name="actor"></p>
        <p>Lead Actress: <input type="text" name="actress"></p>
        <p>Genre: <input type="text" name="genre"></p>
        <p>Year: <input type="text" name="year"></p><br/>
        <p><input type="submit" name="submit" value="Add Movie"></p>
        <input type="hidden" name="page" value="add">
        </form>
    </body>
</html>
