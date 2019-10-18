<%-- 
    Document   : part7_view
    Created on : 2019-2-10, 21:45:47
    Author     : Administrator
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Result</title>
    </head>
    <body>
        <p><h3>You searched for <c:out value="${requestScope.keyword}" /></h3>
        <h2><u>Here are the search results</u></h2><br/>
        <table border=1>
            <tr bgcolor="#FFAD00" />
            <th/>Movie Title<th/>Lead Actor<th/>Lead Actress<th/>Genre<th/>Year
            <c:forEach var="movie" items="${requestScope.movieList}">
                <tr/><td/><c:out value="${movie.getTitle()}" />
                    <td/><c:out value="${movie.getActor()}" />
                    <td/><c:out value="${movie.getActress()}" />
                    <td/><c:out value="${movie.getGenre()}" />
                    <td/><c:out value="${movie.getYear()}" />
            </c:forEach>   
        </table><br/>
        <a href="redirect.jsp">Click here to go back to the main page</a>
    </body>
</html>
