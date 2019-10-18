<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entry</title>
    </head>
    <body>
        <form action="entry.htm">
        <h2>Welcome to Our Movie Store</h2>
        <h2>Please Make Your Selection Below</h2><br/>
        <select name="selection">
            <option value="browse">Browse Movies</option>
            <option value="add">Add New Movies to Database</option>
        </select>
        <input type="submit" value="Send" />
        <input type="hidden" name="page" value="home" />
        </form>
    </body>
</html>
