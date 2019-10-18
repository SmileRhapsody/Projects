<%-- 
    Document   : HW3_part4
    Created on : 2019-2-7, 20:22:21
    Author     : Administrator
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/xml" prefix = "x" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Jstl</title>
</head>
<body>
    <%-- core & fmt --%>
    <div><center>
        <P><h2>Even Number From 1001 - 1010</h2>
        <c:set var = "now" value = "<%= new java.util.Date()%>" />
        <fmt:timeZone value="America/New_York">
        <fmt:formatDate type = "both" dateStyle = "medium" 
           timeStyle = "medium" value = "${now}" /><br/><br/>         
        </fmt:timeZone>
        <c:forEach var="i" begin="1001" end="1010">
            <c:if test="${i%2 == 0}">
                <c:out value="${i}" />&nbsp;&nbsp;&nbsp;
                Transfer to Currency:
                <fmt:setLocale value="zh_cn" />
                <fmt:formatNumber value="${i}" type="currency" /><br/> 
            </c:if>
            <c:if test="${i%2 == 1}">
                <c:remove var = "i" />
            </c:if>
        </c:forEach>
    </center></div>
    <%-- sql & fn --%>    
    <div><br/><center>
        <p><h2>Show The Movie Database</h2>
        <sql:setDataSource var="connection" driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/info6250?serverTimezone=UTC"
            user="root" password="123456" />
        <sql:update dataSource="${connection}" var="count">
         INSERT INTO movies(`title`,`actor`,`actress`,`genre`,`year`) 
         VALUES ('Venom', 'Tom Hardy', 'Michelle Williams', 'Venom', 2018);
        </sql:update>
        <sql:query dataSource="${connection}" var="result">
            SELECT * from movies;
        </sql:query>
        <table border="1" width="50%">
            <tr>
                <th>Title</th>
                <th>Actor</th>
                <th>Actress</th>
                <th>Genre</th>
                <th>Year</th>
            </tr>
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.title}" /></td>
                    <td><c:out value="${row.actor}" /></td>
                    <td><c:out value="${row.actress}" /></td>
                    <td><c:out value="${row.genre}" /></td>
                    <td><c:out value="${row.year}" /></td>
                </tr>
            </c:forEach>
        </table>
            
        <p/><h2>Find The Movies Whose Name Contains "n"</h2>
        <table border="1" width="50%">
            <tr>
                <th>Title</th>
                <th>Actor</th>
                <th>Actress</th>
                <th>Genre</th>
                <th>Year</th>
            </tr>
            <c:forEach var="row" items="${result.rows}">
                <c:if test="${fn:containsIgnoreCase(row.title, 'n')}">
                    <tr>
                    <td><c:out value="${fn:join(fn:split(row.title, ' '), '-')}" />
                    <td><c:out value="${fn:join(fn:split(row.actor, ' '), '-')}" />
                    <td><c:out value="${fn:join(fn:split(row.actress, ' '), '-')}" />
                    <td><c:out value="${fn:join(fn:split(row.genre, ' '), '-')}" />
                    <td><c:out value="${fn:join(fn:split(row.year, ' '), '-')}" />
                    </tr>
                </c:if>
            </c:forEach>
        </table>
            
        <p><h2>Delete The Movie: Venom</h2>
        <sql:update dataSource="${connection}" var="count">
            DELETE FROM movies WHERE title="Venom";
        </sql:update>
        <sql:query dataSource="${connection}" var="result">
            SELECT * from movies;
        </sql:query>
        <table border="1" width="50%">
            <tr>
                <th>Title</th>
                <th>Actor</th>
                <th>Actress</th>
                <th>Genre</th>
                <th>Year</th>
            </tr>
            <c:forEach var="row" items="${result.rows}">
                <tr>
                    <td><c:out value="${row.title}" /></td>
                    <td><c:out value="${row.actor}" /></td>
                    <td><c:out value="${row.actress}" /></td>
                    <td><c:out value="${row.genre}" /></td>
                    <td><c:out value="${row.year}" /></td>
                </tr>
            </c:forEach>
        </table>
        
    </center></div>
    <%-- xml --%>     
    <div><center>
        <h2>Movie Information</h2>
        <c:set var="xmltext">
            <movies>  
            <movie>  
              <title>Ghost</title>  
              <actor>Patrick Swayze</actor>  
              <actress>Demi Moore</actress>  
            </movie>  
            <movie>  
              <title>Venom</title>  
              <actor>Tom Hardy</actor>  
              <actress>	Michelle Williams</actress>   
            </movie>
            <movie>  
              <title>Wandering Earth</title>  
              <actor>Chuxiao Qu</actor>  
              <actress>Jinmai Zhao</actress>   
            </movie>
            </movies> 
        </c:set>
        <x:parse xml = "${xmltext}" var = "output"/>
        <ul class = "list">
            <x:forEach select = "$output/movies/movie/title" var = "item">
                    Movie Title : <x:out select = "$item" /><br/>
            </x:forEach>
        </ul>
    </center></div>
</body>
</html>
