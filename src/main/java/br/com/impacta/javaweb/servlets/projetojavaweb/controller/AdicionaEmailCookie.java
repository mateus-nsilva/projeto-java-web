package br.com.impacta.javaweb.servlets.projetojavaweb.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdicionaEmailCookie", value = "/AdicionaEmailCookie")
public class AdicionaEmailCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String emailRecebido = request.getParameter("email");
        Cookie cookie = new Cookie("email", emailRecebido);
        response.addCookie(cookie);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.html");
        dispatcher.forward(request, response);
    }
}
