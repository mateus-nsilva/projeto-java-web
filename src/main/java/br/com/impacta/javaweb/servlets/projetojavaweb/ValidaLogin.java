package br.com.impacta.javaweb.servlets.projetojavaweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ValidaLogin", value = "/ValidaLogin")
public class ValidaLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        final String loginValido = "mateus";
        final String senhaValida = "123456";

        out.println("<html><body>");
        if(loginValido.equals(login) && senhaValida.equals(senha)) {
//            out.println("login e senha válido");
            out.println("<h1>login e senha válido</h1>");
        } else {
//            out.println("Erro ao tentar realizar o login");
            out.println("<h1>Erro ao tentar realizar o login</h1>");
            response.setStatus(400);
        }
        out.println("</body></html>");
    }
}
