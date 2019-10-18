<%-- 
    Document   : updateResult
    Created on : 2019-4-16, 11:48:26
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
    <body><div><center><br/><br/><br/>
        <h1>Name: ${name} Id: ${id}</h1><br/>
        <c:if test="${result==1}">
            <h1><c:out value="Update Successfully" /></h1>
        </c:if>
        <c:if test="${result==0}">
            <h1><c:out value="Update Failed" /></h1>
        </c:if>
            
            <form action="choice.htm" method="post">
                <input type="hidden" name="page" value="entry" />
                <input type="hidden" name="type" value="${type}" />
                <input type="hidden" name="name" value="${name}" />
                <input type="hidden" name="password" value="${password}" />
                <input type="submit" name="submit" value="Back" />
            </form>
                </center></div>
    </body>
</html>
