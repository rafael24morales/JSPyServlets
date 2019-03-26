<%-- 
    Document   : Login
    Created on : Mar 26, 2019, 1:16:48 PM
    Author     : rafaelm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola con JSP</title>
    </head>
    <body>
        <form action="LoginServlet" method="POST">
            <input type="email" placeholder="Ingresa e-mail" name="email"/>
            <input type="password" placeholder="Ingresa contraseña" name="password"/>
            <input type="submit" value="Valida Usr"/>
        </form>
    </body>
</html>
