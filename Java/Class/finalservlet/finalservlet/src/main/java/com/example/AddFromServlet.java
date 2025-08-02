package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author - Sumesh Gajmer
 * @date - 13/07/2025
 */

@WebServlet("/add")
public class AddFromServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int sum = num1 + num2;

            out.println("<h2>Result</h2>");
            out.println("<p>" + num1 + " + " + num2 + " = " + sum + "</p>");
            out.println("<a href='add.html'>Back</a>");
        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Invalid input!</p>");
            out.println("<a href='add.html'>Back</a>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int sum = num1 + num2;

            out.println("<h2>Result</h2>");
            out.println("<p>" + num1 + " + " + num2 + " = " + sum + "</p>");
            out.println("<a href='add.html'>Back</a>");
        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Invalid input!</p>");
            out.println("<a href='add.html'>Back</a>");
        }
    }
}
