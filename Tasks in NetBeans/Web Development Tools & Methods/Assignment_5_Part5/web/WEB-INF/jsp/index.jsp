<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <c:choose>
            <c:when test="${pageAttribute.equals('finish')}">
                <div><center>
                    <h1>Quiz Result</h1><br/>
                    <table border="1">
                        <tr/><th/>Question Number<th/>Answer
                        <c:forEach var="number" begin="1" end="4" >
                            <tr/><td/>${number}<td/>${result.choice[number-1]}
                        </c:forEach>
                    </table>
                </center></div>
            </c:when>
            <c:when test="${pageAttribute.equals('cancel')}">
                <form action="1.htm" method="post">
                    Let's begin the quiz
                    <input type="submit" value="开始" name="_target0"/>
                </form>
            </c:when>
        </c:choose>
        
        <c:if test="${pageNumber==0}">
            <form action="2.htm" method="post">
                ${title}<br>
                <c:forEach var="option" items="${question}">
                    <input type='radio' name="choice[0]" value="${option}"/>${option}<br />
                </c:forEach>
                <input type="submit" value="Next" name="_target1"/>
            </form>
            <form action="cancel.htm" method="post">
                <input type="submit" value="Cancel" name="_cancel"/>
            </form>
        </c:if>
        <c:forEach begin="1" end="2" var="number">
        <c:if test="${pageNumber==number}">
            <form action="${number+2}.htm" method="post">
                ${title}<br>
                <c:forEach var="option" items="${question}">
                    <input type='radio' name="choice[${number}]" value="${option}"/>${option}<br />
                </c:forEach>
                <input type="submit" value="Next" name="_target${number+1}"/><br/>
            </form >
            <form action="${number}.htm" method="post">
                <input type="submit" value="Previous" name="_target${number-1}"/>
            </form>
            <form action="cancel.htm" method="post">
                <input type="submit" value="Cancel" name="_cancel"/>
            </form>
        </c:if>
        </c:forEach>
        <c:if test="${pageNumber==3}">
            <form action="result.htm" method="post">
                ${title}<br>
                <c:forEach var="option" items="${question}">
                    <input type='radio' name="choice[3]" value="${option}"/>${option}<br />
                </c:forEach>
                <input type="submit" value="Next" name="_finish"/>
            </form>
            <form action="1.htm" method="post">
                <input type="submit" value="Previous" name="_target2"/>
            </form>
            <form action="cancel.htm" method="post">
                <input type="submit" value="Cancel" name="_cancel"/>
            </form>
        </c:if>
    </body>
    
</html>
