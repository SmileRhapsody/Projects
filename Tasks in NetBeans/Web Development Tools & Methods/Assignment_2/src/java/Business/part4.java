/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class part4 extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String movieTitle = request.getParameter("title");
        String leadActor = request.getParameter("actor");
        String leadActress = request.getParameter("actress");
        String genre = request.getParameter("genre");
        String year = request.getParameter("year");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Result</title>");            
        out.println("</head>");
        out.println("<body>");
        Connection connection = null;
        Statement stm = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info6250?serverTimezone=UTC", "root", "123456");
            stm = connection.createStatement();
            String query = "INSERT INTO movies (title, actor, actress, genre, year) VALUES ('" 
                    + movieTitle + "', '" + leadActor + "', '" + leadActress + "', '" + genre + "', '" + year + "');";
            int result = stm.executeUpdate(query);
            if (result > 0) {
                out.println("<h1>1 Movie Added Successfully</h1>");
            } else {
                out.println("<h1>Movie Added Failed</h1>");
            }
            stm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println("<a href='hw2_part4.html'>Click here to go back to the main page</a>");
        out.println("</body>");
        out.println("</html>");
    }
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        String search = request.getParameter("searchBy");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Result</title>");            
        out.println("</head>");
        out.println("<body>");
        Connection connection = null;
        Statement stm = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info6250?serverTimezone=UTC", "root", "123456");
            stm = connection.createStatement();
            String query = "select * from movies";
            if (search.equals("title")) {
                query = "select * from movies where title = '" + keyword + "'";
            } else if (search.equals("actor")) {
                query = "select * from movies where actor = '" + keyword + "'";
            } else if (search.equals("actress")) {
               query = "select * from movies where actress = '" + keyword + "'";
            }
            out.println("<p>You searched for '" + keyword + "'</p>");
            out.println("<u>Here are the search results</u><br/>");
            out.println("<table border=1>");
            ResultSet results = stm.executeQuery(query);
            out.println("<tr><th>Movie Title<th>Lead Actor<th>Lead Actress<th>Genre<th>Year");
 
            while (results.next()) {
                out.println("<tr>");
                for (int i = 1; i <= 5; i++) {
                    String value = results.getString(i);
                    out.println("<td>" + value);
                }
            }
            results.close();
            stm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println("</table>");
        out.println("<a href='hw2_part4.html'>Click here to go back to the main page</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
