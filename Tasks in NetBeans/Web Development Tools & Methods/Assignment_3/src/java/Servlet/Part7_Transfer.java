/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class Part7_Transfer extends HttpServlet{
    
    /**
     *
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        response.setContentType("text/html");
        
        String option = request.getParameter("selection");
        if(option.equals("Browse Movies"))
            request.getRequestDispatcher("part7_browse.jsp").forward(request, response);
        if(option.equals("Add New Movies to Database"))
            request.getRequestDispatcher("part7_add.jsp").forward(request, response);
    }
}
