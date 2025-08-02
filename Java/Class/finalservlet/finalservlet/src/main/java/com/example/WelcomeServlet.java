package com.example;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String name = request.getParameter("username");

        // Store name in cookie
        Cookie cookie = new Cookie("username", name);
        cookie.setMaxAge(60 * 60 * 24); // 1 day
        response.addCookie(cookie);

        // Store in session
        HttpSession session = request.getSession();
        session.setAttribute("username", name);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome, " + name + "!</h2>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        // Try to retrieve from session
        HttpSession session = request.getSession(false);
        String name = null;

        if (session != null) {
            name = (String) session.getAttribute("username");
        }

        // If session is missing, check cookie
        if (name == null) {
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie c : cookies) {
                    if (c.getName().equals("username")) {
                        name = c.getValue();
                        break;
                    }
                }
            }
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (name != null) {
            out.println("<h2>Welcome back, " + name + "!</h2>");
        } else {
            out.println("<h2>Hello, new user!</h2>");
            out.println("<a href='cookie.html'>Go to login page</a>");
        }
    }
}

