package com.example.servletjsp.Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  HttpServlet 객체를 이용하여 ServletContext를 추출하는 예제.
 */
@WebServlet("/context2")
public class ServletContextTest2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        ServletContext sc = this.getServletContext();
        String location = sc.getInitParameter("contextConfig");
        writer.println("location : " + location);
        writer.print("Context : " + sc);
        writer.close();
    }
}
