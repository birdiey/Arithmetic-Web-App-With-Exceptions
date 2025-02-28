
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.business.AddingOperations;
import za.ac.tut.business.Addition;
import za.ac.tut.business.NumberException;

public class AddingServlet extends HttpServlet {


 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            Integer num1 =Integer.parseInt( request.getParameter("num1"));
            Integer num2 =Integer.parseInt( request.getParameter("num2"));
            
            
            AddingOperations ao = new Addition();
            int sum = ao.add(num1, num2);
            
            request.setAttribute("num1", num1);
            request.setAttribute("num2", num2);
            request.setAttribute("sum", sum);
            
            RequestDispatcher disp = request.getRequestDispatcher("sum_outcome.jsp");
            disp.forward(request, response);
        } catch (NumberException ex) {
            Logger.getLogger(AddingServlet.class.getName()).log(Level.SEVERE, null, ex);
        throw new ServletException(ex);
        }
    }

}
