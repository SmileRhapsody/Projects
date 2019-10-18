<%-- 
    Document   : salesAdd
    Created on : 2019-4-18, 18:55:44
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sales</title>
    </head>
    <body>
        <div><center><br/><br/><br/>
            <h1>Please Select Products From Suppliers</h1>
            <form action="sales.htm" method="post">
            <table border=1 align='center'>
            <tr bgcolor='#FFAD00'/><th/>Supplier Name<th/>Product Name
            <th/>Product Price<th/>Product Count<th/>Buying Count
            <c:forEach var="supplier" items="${suppliers}">
                <c:forEach var="product" items="${supplier.products}">
                    <tr/><td/><c:out value="${supplier.supplierName}"/>
                    <td/><c:out value="${product.name}"/>
                    <td/><c:out value="${product.price}"/>
                    <td/><c:out value="${product.count}"/>
                    <td/><input type="text" name="${supplier.supplierName}${product.name}count" />
                </c:forEach>
            </c:forEach>
            </table><br/>
            <input type="hidden" name="salesName" value="${salesName}"/>
            <input type="submit"  name="submit" value="Add" />
        </form>
        </center></div>
    </body>
</html>
