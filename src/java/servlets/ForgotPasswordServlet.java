/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import businesslogic.AccountService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 578291
 */
public class ForgotPasswordServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       getServletContext().getRequestDispatcher("/WEB-INF/ForgotPassword.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String action = request.getParameter("action");
        if(action != null && !action.equals(""))
        {
            if(action.equals("email"))
            {
                if(email != null && !email.equals(""))
                {
                    AccountService as = new AccountService();
                    String path = getServletContext().getRealPath("/WEB-INF");
                    try
                    {
                        as.forgotPassword(email, path);
                    }
                    catch(Exception e)
                    {
                        
                    }
                    
                }
            }
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/ForgotPassword.jsp").forward(request, response);
    }

}
