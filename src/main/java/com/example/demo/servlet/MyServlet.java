package com.example.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/7/5
 * @ Description：通过代码注册Servlet 示例代码
 * 代码注册通过ServletRegistrationBean、 FilterRegistrationBean
 * 和 ServletListenerRegistrationBean 获得控制
 * @ throws
 */
public class MyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h5>hello，this is a Servlet</h5>");
        out.println("</body>");
        out.println("</html>");
    }
}
