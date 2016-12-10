/**
 * 
 */
package com.javatpoint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author admin
 *
 */
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        System.out.println("LogoutServlet");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        request.getSession().invalidate();
        response.setHeader("Cache-control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", -1);

        out.print("You are successfully logged out!");
        request.getRequestDispatcher("customer.jsp").include(request, response);

        System.out.println("You are successfully logged out!");

        out.close();
    }
}