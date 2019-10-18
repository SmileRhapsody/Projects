<%-- 
    Document   : searchResult
    Created on : 2019-3-7, 14:23:02
    Author     : Administrator
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Browse Result</title>
    </head>
    <body>
        <p>You searched for "${keyword}"</p>
        <u>Here are the search results</u><br/>
        <table border="1">
            <tr/><th/>MovieID<th/>Movie Title<th/>Lead Actor<th/>Lead Actress<th/>Genre<th/>Year
            <c:forEach var="movie" items="${result}">
                <tr/><td/>${movie.id}<td/>${movie.title}<td/>${movie.actor}<td/>${movie.actress}<td/>${movie.genre}<td/>${movie.year}
            </c:forEach>
        </table>
        <a href="redirect.jsp">Go Back to Main Page</a>

    </body>
</html>
