package br.com.impacta.javaweb.servlets.projetojavaweb.controller;

import br.com.impacta.javaweb.servlets.projetojavaweb.model.Usuario;
import org.jetbrains.annotations.NotNull;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CadastroUsuario", value = "/CadastroUsuario")
public class CadastroUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuario = new Usuario();
        usuario.setNome(request.getParameter("nome"));
        usuario.setLogin(request.getParameter("login"));
        usuario.setEmail(request.getParameter("email"));
        usuario.setSenha(request.getParameter("senha"));

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro realizado com sucesso!!</title>");
        out.println("<head>");

        out.println("<body>");
        out.println("<h1>" + "Nome: " + usuario.getNome() + "</h1><br>");
        out.println("<h2>" + "Login: " + usuario.getLogin() +"</h2><br>");
        out.println("</body></html>");
    }
}
