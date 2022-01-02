package com.example.servletjsp.Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//ServletContext 객체에 저장된 값을 추출하는 예제
@WebServlet("/context5")
public class ServletContextTest5Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        ServletContext sc = this.getServletContext();

        SharObject obj1 = (SharObject) sc.getAttribute("data1");
        SharObject obj2 = (SharObject) sc.getAttribute("data2");

        out.print("Data 1 : " + obj1.getCount() + " , " + obj1.getStr() + "<br>");
        out.print("Data 2 : " + obj2.getCount() + " , " + obj2.getStr() + "<br>");

        out.close();
    }
}
