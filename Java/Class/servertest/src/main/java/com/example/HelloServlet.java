package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author - Sumesh Gajmer
 * @date - 12/07/2025
 */

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    public HelloServlet() {
        super();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        // 2. Get a PrintWriter object to send text content back to the client.
        // The PrintWriter writes directly to the response body.
        PrintWriter out = resp.getWriter();

        // 3. Write the simple HTML content to the response.
        // This is a very basic HTML page without any complex styling.
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<title>Simple Hello Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("    <h1>Hello from Simple Servlet!</h1>");
        out.println("    <p>This is a very basic HTML page served by the servlet.</p>");
        out.println("</body>");
        out.println("</html>");

        // 4. Close the PrintWriter.
        // It's important to close the stream to release resources.
        out.close();
    }
}
