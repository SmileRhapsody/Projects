<%-- 
    Document   : part7_browse
    Created on : 2019-2-10, 21:34:18
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Browse</title>
    </head>
    <body>
        <form action="browse.htm">
        <div><h1>Serching Movies</h1></div><br/>
        Keyword:<input type="text" name="keyword"><br/><br/>
        <input type="radio" name="searchBy" value="title" checked="checked">
        Search By Title<br/>
        <input type="radio" name="searchBy" value="actor">
        Search By Actor<br/>
        <input type="radio" name="searchBy" value="actress">
        Search By Actress<br/>
        <p><input type="submit" value="Search Movies"></p>
        <input type="hidden" name="page" value="browse">
        </form>
    </body>
</html>
