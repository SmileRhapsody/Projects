<%-- 
    Document   : part5_music
    Created on : 2019-2-9, 21:58:31
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
        <form action="part5" method="post">
            <h1><center>Shop for CDs</h1>
            <hr />
            <p align="right"><a href="part5_cart.jsp">View Cart</a></p><br/>
            <input type="checkbox" name="music" value="I'm Going to Tell You a Secret by Madonna">
            I'm Going to Tell You a Secret by Madonna [$26.99]<br/>
            <input type="checkbox" name="music" value="Baby One More Time by Britney Spears">
            Baby One More Time by Britney Spears [$10.95]<br/>
            <input type="checkbox" name="music" value="Justified by Jurtin Tnmberlake">
            Justified by Jurtin Tnmberlake [$9.97]<br/>
            <input type="checkbox" name="music" value="Loose by Nelly Furtado">
            Loose by Nelly Furtado [$13.98]<br/>
            <input type="checkbox" name="music" value="Gold Digger by Kanye West">
            Gold Digger by Kanye West [$27.99]<br/>
            <p><center><input type="submit" value="Add to Chart"></center>
        </form>
    </body>
</html>
