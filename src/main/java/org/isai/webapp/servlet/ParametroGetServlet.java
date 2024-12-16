package org.isai.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parametros/url-get")
public class ParametroGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //El servlet extrae el valor de saludo
        String saludo = request.getParameter("saludo");
        String nombre = request.getParameter("nombre");
        //el servlet genera una página HTML que muestra el saludo enviado.
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Parametros del request </title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Parametros del request </h1>");
            if (saludo != null && nombre != null) {
                out.println("<h2> El saludo enviado es: " + saludo + " " + nombre + "</h2>");
            } else if (saludo != null) {
                out.println("<h2> El saludo enviado es: " + saludo + "</h2>");
            } else if (nombre != null) {
                out.println("<h2> El Nombre enviado es: " + nombre + "</h2>");
            } else {
                out.println("<h2>No se han pasado los parametros saludos ni nombre.</h2>");
            }
            try {

                int codigo = Integer.parseInt(request.getParameter("codigo"));
                out.println("<h3>El codidgo que se ah pasado es: " + codigo + "</h3>");
            } catch (NumberFormatException e) {
                out.println("<h2>No se ha enviado el codigo. Es null!.</h2>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

}
