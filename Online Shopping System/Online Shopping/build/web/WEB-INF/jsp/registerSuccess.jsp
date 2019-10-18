<%-- 
    Document   : successRegister
    Created on : 2019-4-14, 20:49:24
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Result</title>
    </head>
    <body><div><center><br/><br/><br/>
                    
        <c:if test="${result==1}">
            <h1><c:out value="Register Successfully" /></h1>
        </c:if>
        <c:if test="${result==0}">
            <h1><c:out value="Update Failed" /></h1>
        </c:if>
            
            <form action="choice.htm" method="post">
                <input type="hidden" name="page" value="role" />
                <input type="hidden" name="type" value="${type}" />
                <input type="submit" name="submit" value="Back" />
            </form>
                </center></div>
    </body>
</html>
