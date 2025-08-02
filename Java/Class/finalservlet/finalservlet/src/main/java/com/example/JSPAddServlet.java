package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @author - Sumesh Gajmer
* @date - 13/07/2025
*/

@WebServlet("/add-jsp")
public class JSPAddServlet extends HttpServlet {
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

       try {
           int num1 = Integer.parseInt(request.getParameter("num1"));
           int num2 = Integer.parseInt(request.getParameter("num2"));

           AdditionModel model = new AdditionModel(num1, num2);
           request.setAttribute("model", model);

           RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
           dispatcher.forward(request, response);

       } catch (NumberFormatException e) {
           response.sendRedirect("add.jsp");
       }
   }
}
