package br.com.impacta.javaweb.servlets.projetojavaweb;

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
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String nome = request.getParameter("nome");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        String confirmeSenha = request.getParameter("confirmeSenha");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro realizado com sucesso!!</title>");
        out.println("<head>");

        out.println("<body>");
        out.println("<h1>" + "Nome: " + nome + "</h1><br>");
        out.println("<h2>" + "Login: " + login +"</h2><br>");
        out.println("<h2>" + "Senha: " + senha +"</h2><br>");
        out.println("<h2>" + "SenhaConfirmada: " + confirmeSenha +"</h2><br>");
        out.println("</body></html>");
    }
}
