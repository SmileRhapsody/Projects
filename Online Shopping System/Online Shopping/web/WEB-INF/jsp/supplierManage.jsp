<%-- 
    Document   : supplierManage
    Created on : 2019-4-15, 16:47:03
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Supplier Namagement</title>
    </head>
    <body>
        <div>
            <center><br/><br/><br/>
        <form action="choice.htm" method="post">
            <h1><center>View ${supplierName}'s Products</center></h1><br/>
            <table border=1>
                <tr bgcolor='#FFAD00'/><th/>Product Name<th/>Price<th/>Count
                <c:forEach var="product" items="${products}">
                    <tr/><td/><c:out value="${product.name}"/>
                    <td/><c:out value="${product.price}"/>
                    <td/><c:out value="${product.count}"/>
                </c:forEach>
            </table><br/>
            <input type="hidden" name="page" value="entry" />
                <input type="hidden" name="type" value="${type}" />
                <input type="hidden" name="name" value="${name}" />
                <input type="hidden" name="password" value="${password}" />
            <p><center><input type="submit" name="submit" value="Back"></center>
        </form>
            </center>
        </div>
    </body>
</html>
