package com.example.servletjsp.Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//servletContext 객체를 이용하여 웹 에플리케이션 내의 저장하는 코드.
@WebServlet("/context4")
public class ServletContextTest4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        ServletContext sc = this.getServletContext();

        SharObject obj1 = new SharObject();
        obj1.setCount(100);
        obj1.setStr("객체 공유 테스트 - 1");
        sc.setAttribute("data1", obj1);

        SharObject obj2 = new SharObject();
        obj2.setStr("객체 공유 테스트 -2");
        obj2.setCount(200);
        sc.setAttribute("data2", obj2);

        out.print("ServeltContext 객체에 데이터 등록을 하였습니다.");
        out.close();
    }
}
