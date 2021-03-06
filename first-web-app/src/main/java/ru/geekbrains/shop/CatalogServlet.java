package ru.geekbrains.shop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/catalog/*")
public class CatalogServlet extends HttpServlet {

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/page_header").include(req, res);
        res.getWriter().println("<h1>Каталог</h1>");
    }
}
