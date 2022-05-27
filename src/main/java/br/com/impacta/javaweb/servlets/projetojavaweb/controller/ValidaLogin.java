package br.com.impacta.javaweb.servlets.projetojavaweb.controller;

import br.com.impacta.javaweb.servlets.projetojavaweb.model.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(name = "ValidaLogin", value = "/ValidaLogin")
public class ValidaLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String loginValido = "mateus";
        final String senhaValida = "123456";

        Usuario usuario = new Usuario();
        usuario.setLogin(request.getParameter("login"));
        usuario.setSenha(request.getParameter("senha"));

        if(senhaValida.equals(usuario.getSenha()) && Objects.nonNull(usuario.getLogin())) {
            // usamos request.getRequestDispatcher quando vamos redirecionar para um nova pagina e precisamos
            // utilizar os dados em outra página
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Sistema");
            // dispatcher.forward faz o redirect
            dispatcher.forward(request, response);
            request.getSession().setAttribute("usuario", usuario);
        } else {
            // apenas redireciona para uma nova página de erro
            response.sendRedirect("/erro_login.html");
        }
    }
}
