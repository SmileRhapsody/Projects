<%-- 
    Document   : part5_cart
    Created on : 2019-2-10, 12:08:18
    Author     : Administrator
--%>
<%@page import="Business.Order" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Cart</title>
    </head>
    <body>
        <form action="part5" method="get">
            <h1><center>View Cart</center></h1><br/>
            <table border=1 align='center'>
                <tr bgcolor='#FFAD00'/><th/>Item Name<th/>Amount
                <c:if test="${sessionScope.order != null}">
                    <c:forEach var="item" items="${sessionScope.order.getOrders()}">
                        <tr/><td/><c:out value="${item.getName()}" />
                        <td/><input type="text" name="${item.getName()}" value="${item.getCount()}"/>
                    </c:forEach>
                </c:if>
            </table><br/>
            <p><center><input type="submit" value="Update"></center>
        </form>
    </body>
</html>
