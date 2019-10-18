<%-- 
    Document   : summary
    Created on : 2019-4-19, 2:13:41
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
        <h1><center>View Revenue Summary</center></h1><br/>
        <table border=1 align='center'>
            <tr bgcolor='#FFAD00'/><th/>Sales Name<th/>Revenue
            <c:forEach var="summary" items="${summaries}">
                <tr/><td/><c:out value="${summary.salesName}"/>
                <td/><c:out value="${summary.revenue}"/>
            </c:forEach>
        </table><br/>
    </body>
</html>
