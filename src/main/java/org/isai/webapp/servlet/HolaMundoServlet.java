package org.isai.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "HolaMundoServlet", urlPatterns = {"/HolaMundoServlet"})
public class HolaMundoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HolaMundoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Mi primer servlet</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
