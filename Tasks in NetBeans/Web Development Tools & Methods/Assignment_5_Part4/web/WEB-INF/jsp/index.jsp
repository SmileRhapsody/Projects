<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz</title>
    </head>
    <body>
        <c:if test="${requestScope.pageNumber == null}">
            <c:redirect url="/quiz/1.htm" />
        </c:if>
        <c:choose>
            <c:when test="${requestScope.pageNumber == 5}">
                <div><center/>
                <h1>Quiz Result</h1><br/>
                <table border="1">
                    <tr/><th/>Question Number<th/>Answer
                    <c:forEach var="number" begin="1" end="4" >
                        <tr/><td/>${number}<td/>${sessionScope.result.result.get(number-1)}
                    </c:forEach>
                </table></div>
            </c:when>
            
            <c:otherwise>
                <form action = "${requestScope.url}" method='post'>
                    <p>${requestScope.question.title}</p>
                    <c:forEach var="option" items="${requestScope.question.optionList}">
                        <input type='radio' name="question${requestScope.pageNumber}" value="${option}"/>${option}<br />
                    </c:forEach>
                    <input type="hidden" name="page" value="${requestScope.pageNumber+1}" />
                    <input type='submit' value ='Next'/>
                </form>
            </c:otherwise>
        </c:choose>
    </body>
</html>
