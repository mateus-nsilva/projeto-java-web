package br.com.impacta.javaweb.servlets.projetojavaweb.controller;

import br.com.impacta.javaweb.servlets.projetojavaweb.model.Usuario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ColetaEmail", value = "/ColetaEmail")
public class ColetaEmail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Usuario usuarioSistema = (Usuario) request.getSession().getAttribute("usuario");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cadastro de Email </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + usuarioSistema.getLogin() + " informe o seu email: " + "</h1>");
        out.println("<form method=\"post\" action=\"AdicionaEmailCookie\">");
        out.println("Email: <input type=\"text\" name=\"email\" size=\"50\"><br>");
        out.println("<input type=\"submit\" value=\"Enviar\">");
        out.println("</form>");
        out.println("<h3>Esta é a página principal do sistema </h3>");
        out.println("<h3><a href=\"login.html\">Logout</a></h3>");
        out.println("</body>");
        out.println("</html>");
    }
}
