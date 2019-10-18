<%-- 
    Document   : part7_success
    Created on : 2019-2-10, 21:45:13
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
        <h1><c:out value="${requestScope.show}" /></h1><br/>
        <a href="part7.jsp">Click here to go back to the main page</a>
    </body>
</html>
