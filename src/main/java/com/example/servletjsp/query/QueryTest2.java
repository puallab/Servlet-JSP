package com.example.servletjsp.query;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest2")
public class QueryTest2 extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<html><head><title>Query 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식으로 요청되었습니다. </h1>");
        ServletInputStream input = req.getInputStream();
        int len = req.getContentLength();
        byte[] buf = new byte[len];
        input.readLine(buf, 0, len);
        String s = new String(buf);
        out.print("전체 문자열 : " + s);
        out.print("</body></html>");
        out.close();
    }
}
