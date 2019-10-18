<%-- 
    Document   : part5_view
    Created on : 2019-2-9, 22:39:56
    Author     : Administrator
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Items</title>
    </head>
    <body bgcolor='#FDF5E6'>
        <c:if test="${requestScope.paramValues != null}">
            <h2>The following item has been added to your shopping cart successfully</h2>
            <c:forEach var="itemName" items="${requestScope.paramValues}">
            <li><c:out value="${itemName}"/></li><br/>
            </c:forEach>
        </c:if>
        <p><a href="part5_cart.jsp">View Cart</a>
           <a href="part5_book.jsp">Go to Book Page</a>
           <a href="part5_music.jsp">Go to Music Page</a>
           <a href="part5_computer.jsp">Go to Computer Page</a>
    </body>
</html>
