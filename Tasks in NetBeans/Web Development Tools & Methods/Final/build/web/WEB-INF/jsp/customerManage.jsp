<%-- 
    Document   : customerManage
    Created on : 2019-4-19, 1:53:04
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
        <div>
            <center><br/><br/><br/>
        <h1><center>View ${customerName}'s Orders</center></h1><br/>
        <table border=1 align='center'>
            <tr bgcolor='#FFAD00'/><th/>Sales Name<th/>Supplier Name
            <th/>Product Name<th/>Price<th/>Count
            <c:forEach var="order" items="${orders}">
                <tr/><td/><c:out value="${order.salesName}"/>
                <td/><c:out value="${order.supplierName}"/>
                <td/><c:out value="${order.productName}"/>
                <td/><c:out value="${order.salingPrice}"/>
                <td/><c:out value="${order.count}"/>
            </c:forEach>
        </table><br/>
            <form action="choice.htm" method="post">
                <input type="hidden" name="page" value="entry" />
                <input type="hidden" name="type" value="${type}" />
                <input type="hidden" name="name" value="${name}" />
                <input type="hidden" name="password" value="${password}" />
                <input type="submit" name="submit" value="Back" />
            </form>
        </center>
        </div>
    </body>
</html>
