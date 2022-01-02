package com.example.servletjsp.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 클라이언트의 방문 횟수 기록 및 출력하는 예제.
@WebServlet("/cookie3")
public class CookieTest3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cnt = 0;
        Cookie[] cookies = req.getCookies();
        for(int i =0; cookies != null && i< cookies.length; i++){
            if(cookies[i].getName().equals("count")) {
                cnt = Integer.parseInt(cookies[i].getValue());
            }
        }
        cnt++;
        Cookie c = new Cookie("count", cnt+"");
        c.setMaxAge(60*60*24*10);
        resp.addCookie(c);

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>방문 횟수 : " + cnt);
        writer.close();
    }
}
