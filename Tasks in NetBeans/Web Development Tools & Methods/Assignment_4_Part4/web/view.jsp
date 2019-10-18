<%-- 
    Document   : part4_view
    Created on : 2019-2-17, 20:20:02
    Author     : Administrator
--%>
<%@ taglib prefix="ex" uri="/WEB-INF/tlds/custom" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ex:ReadCSV fileName="${param.fileName}" />
        
    </body>
</html>
