package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author danny
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        
        request.setAttribute("age", age);

        if (age == null || age.equals("")){
            // Create a helpful message to send to the user
            request.setAttribute("message", "You must give your current age.");
            // forward the reuqest and response objects to the JSP
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;// Very important! Stop the code call.
        }
        else if (age.matches(".*[a-z][A-z].*")) {
            // Create a helpful message to send to the user
            request.setAttribute("message", "You must enter a number.");
            // forward the reuqest and response objects to the JSP
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;// Very important! Stop the code call.
        }
        else {
            int oneYearOlder = Integer.parseInt(age) + 1;
            request.setAttribute("message", "Your age next birthday will be " + oneYearOlder);
        }
        
        // display the age calculator JSP
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);

    }

}
