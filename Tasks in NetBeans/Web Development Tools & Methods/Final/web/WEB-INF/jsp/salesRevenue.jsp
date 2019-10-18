<%-- 
    Document   : salesRevenue
    Created on : 2019-4-23, 21:58:22
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
        <h1>The Revenue of Products</h1>
        <form action="choice.htm" method="post">
            <table border=1 align='center'>
            <tr bgcolor='#FFAD00'/><th/>Supplier Name<th/>Product Name
            <th/>Revenue
            <c:forEach var="summary" items="${productSummary}">
                <tr/><td/><c:out value="${summary.supplierName}"/>
                <td/><c:out value="${summary.productName}"/>
                <td/><c:out value="${summary.revenue}"/>
            </c:forEach>
            </table><br/>
            <input type="hidden" name="page" value="entry" />
            <input type="hidden" name="type" value="${type}" />
            <input type="hidden" name="name" value="${name}" />
            <input type="hidden" name="password" value="${password}" />
            <p><input type="submit" name="submit" value="Back">
        </form>
            </center></div>
    </body>
</html>
