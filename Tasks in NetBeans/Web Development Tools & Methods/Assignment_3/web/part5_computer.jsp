<%-- 
    Document   : part5_computer
    Created on : 2019-2-9, 21:58:21
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
            <h1><center>Shop for Laptops</center></h1>
            <hr />
            <p align="right"><a href="part5_cart.jsp">View Cart</a></p><br/>
            <input type="checkbox" name="computer" value="Apple MacBook Pro with 13.3 Display">
            Apple MacBook Pro with 13.3 Display [$1299.99]<br/>
            <input type="checkbox" name="computer" value="Asus Laptop with Centrino 2 Black">
            Asus Laptop with Centrino 2 Black [$949.95]<br/>
            <input type="checkbox" name="computer" value="HP Pavhos Laptop with Centrino">
            HP Pavhos Laptop with Centrino [$1199.99]<br/>
            <input type="checkbox" name="computer" value="Toshaba Satelite Laptop with Centrino 2-Copper">
            Toshaba Satelite Laptop with Centrino 2-Copper [$899.99]<br/>
            <input type="checkbox" name="computer" value="Sony VAIO Laptop with Core 2 Duo Compolitan Pink">
            Sony VAIO Laptop with Core 2 Duo Compolitan Pink[$799.99]<br/>
            <p><center><input type="submit" value="Add to Chart"></center>
        </form>
    </body>
</html>
