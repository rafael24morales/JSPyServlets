/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.autentication.AutenticationService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utileria.Usuario;

@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       
       AutenticationService autServ = new AutenticationService();
       Usuario usuario = autServ.authentication(email, password);
       if(usuario != null){
           request.setAttribute("user", usuario);
           RequestDispatcher dispatcher 
                   = request.getRequestDispatcher("exito.jsp");
           dispatcher.forward(request, response);
       }else{
           PrintWriter out = response.getWriter();
           out.println("<script type=\"text/javascript\">");
           out.println("alert('Usuario o contraseña no "
                   + "valido, intente de nuevo ')");
           out.println("location='Login.jsp'");
           out.println("</script>");
       }
   }

}
