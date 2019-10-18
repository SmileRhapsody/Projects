<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entry</title>
    </head>

    <body>
        <div>
            <center><br/><br/><br/>
        <h1>${type} Page</h1><br/>
        <form action="choice.htm" method="post">
            User Name: <input type="text" name="name"/>
            Password: <input type="password" name="password" /><br/>
            <input type="hidden" name="page" value="entry">
            <input type="hidden" name="type" value="${type}"><br/><br/><br/>
            <input type="submit" name="submit" value="Log in">
            <input type="submit" name="submit" value="Register">
        </form>
            </center>
        </div>
    </body>
</html>
