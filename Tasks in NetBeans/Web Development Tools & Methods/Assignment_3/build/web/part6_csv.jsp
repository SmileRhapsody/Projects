<%-- 
    Document   : part6_csv
    Created on : 2019-2-10, 20:19:29
    Author     : Administrator
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>View CSV File</center></h1>
        <table border=1 align="center" >
            <tr bgcolor="#FFAD00"/>
            <c:forEach var="title" items="${requestScope.titleList}">
                <th/><c:out value="${title}" />
            </c:forEach>
            <c:forEach var="i" begin="0" end="${requestScope.csvData.get(0).size()-1}">
                <tr/>
                <c:forEach var="j" begin="0" end="${requestScope.csvData.size()-1}">
                    <td/><c:out value="${requestScope.csvData.get(j).get(i)}" />
                </c:forEach>
            </c:forEach>
        </table>
    </body>
</html>
