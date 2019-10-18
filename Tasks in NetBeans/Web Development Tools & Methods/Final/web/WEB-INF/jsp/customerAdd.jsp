<%-- 
    Document   : customerAdd
    Created on : 2019-4-18, 22:55:00
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer</title>
    </head>
    <body>
        <div><center><br/><br/><br/>
        <h1>Buy From Sales</h1>
        <form action="customer.htm" method="post">
            <table border=1 align='center'>
            <tr bgcolor='#FFAD00'/><th/>Sales Name<th/>Supplier Name<th/>Product Name
            <th/>Price<th/>Count<th/>Select
            <c:forEach var="sales" items="${salesList}">
                <c:forEach var="product" items="${sales.salesProducts}">
                    <tr/><td/><c:out value="${sales.name}"/>
                    <td/><c:out value="${product.supplierName}"/>
                    <td/><c:out value="${product.name}"/>
                    <td/><c:out value="${product.salingPrice}"/>
                    <td/><c:out value="${product.count}"/>
                    <td/><input type="text" name="${sales.name}${product.supplierName}${product.name}count" />
                </c:forEach>
            </c:forEach>
            </table><br/>
            <input type="hidden" name="customerName" value="${customerName}"/>
            <input type="submit"  name="submit" value="Buy" />
        </form>
        </center></div>
    </body>
</html>
