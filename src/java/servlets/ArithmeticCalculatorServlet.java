package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstnumber = request.getParameter("first_number");
        String lastnumber = request.getParameter("last_number");
        String operator = request.getParameter("operator");

        // set the attributes for the JSP
        request.setAttribute("firstNumber", firstnumber);
        request.setAttribute("lastNumber", lastnumber);

        // validation: if the parameters don't exist or are empty, show the form again
        if (firstnumber == null || firstnumber.equals("") && lastnumber == null || lastnumber.equals("")) {
            // Create a helpful message to send to the user
            request.setAttribute("result", "---");

            //forward the request and response objects to the JSP
            //display the agecalculator again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;//Very important! Stop the code call.
        } else if (firstnumber.matches("[A-Za-z]") || lastnumber.matches("[A-Za-z]") || firstnumber.equals("") || lastnumber.equals("")) {
            // Create a helpful message to send to the user
            request.setAttribute("result", "invalid");
            // forward the reuqest and response objects to the JSP
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;// Very important! Stop the code call.
        } 
       

        // display the arithmeticcalculator JSP
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
