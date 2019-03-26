<%-- 
    Document   : exito
    Created on : Mar 26, 2019, 3:57:24 PM
    Author     : rafaelm
--%>

<%@page import="utileria.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>INGRESADO CON ÉXITO!!!! :D !!!!!</h1>
        <% Usuario user = (Usuario)request.getAttribute("us"); %>
        <h1>${user.email}</h1>
    </body>
</html>
