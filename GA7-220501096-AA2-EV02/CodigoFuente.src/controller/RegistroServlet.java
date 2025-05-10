package controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");

        request.setAttribute("nombre", nombre);
        request.setAttribute("email", email);
        RequestDispatcher rd = request.getRequestDispatcher("registro.jsp");
        rd.forward(request, response);
    }
}
