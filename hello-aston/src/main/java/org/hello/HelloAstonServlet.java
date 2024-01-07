package org.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloAstonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        String path = req.getRequestURI();
        if ("/hello".equals(path)) {
            PrintWriter pw = resp.getWriter();
            pw.println("<H1>Hello, Aston!</H1>");
        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}
