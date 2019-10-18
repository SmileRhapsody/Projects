<%-- 
    Document   : salesManage
    Created on : 2019-4-18, 18:55:58
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div><center><br/><br/><br/>
        <h1>Please Set The Selling Price</h1>
        <form action="sales.htm" method="post">
            <table border=1 align='center'>
            <tr bgcolor='#FFAD00'/><th/>Supplier Name<th/>Product Name
            <th/>Buying Price<th/>Selling Count<th/>Product Count
            <c:forEach var="product" items="${products}">
                <tr/><td/><c:out value="${product.supplierName}"/>
                <td/><c:out value="${product.name}"/>
                <td/><c:out value="${product.buyingPrice}"/>
                <td/><input type="text" name="${product.supplierName}${product.name}" value="${product.salingPrice}"/>
                <td/><c:out value="${product.count}"/>
            </c:forEach>
            </table><br/>
            <input type="hidden" name="salesName" value="${salesName}"/>
            <input type="submit"  name="submit" value="Manage" />
        </form>
            </center></div>
    </body>
</html>
