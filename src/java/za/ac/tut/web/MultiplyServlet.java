
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.business.Multiplication;
import za.ac.tut.business.MultiplicationOperations;

public class MultiplyServlet extends HttpServlet {

   

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Integer num1 = Integer.parseInt(request.getParameter("num1"));
        Integer num2 = Integer.parseInt(request.getParameter("num2"));
        
        MultiplicationOperations mO = new Multiplication();
        int multiplication=mO.multiply(num1, num2);
        
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("multiplication", multiplication);
        
        
        RequestDispatcher disp = request.getRequestDispatcher("mult_outcome.jsp");
        disp.forward(request, response);
    }

}
