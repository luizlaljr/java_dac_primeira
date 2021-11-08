<%-- 
    Document   : sayhello
    Created on : 08/02/2021, 23:08:15
    Author     : viter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SayHello.jsp</title>
        <link rel="stylesheet" href="./styles/global.css">
    </head>
    <body>
        <div class="container">
            <jsp:useBean id="myBean" class="hello.MessageBean"/>
            <h1>SayHello.jsp</h1>
            <% String lang = request.getParameter("lang"); %>
            <jsp:setProperty name="myBean" property="msg" value="<%=lang%>"/>
            <p><jsp:getProperty name="myBean" property="msg"/>, <%=request.getParameter("nome")%>!</p>
            <p><jsp:getProperty name="myBean" property="saudacao"/>!</p>
        </div>
    </body>
</html>
