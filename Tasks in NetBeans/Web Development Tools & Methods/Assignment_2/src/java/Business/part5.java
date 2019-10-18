/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class part5 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Result</title>");            
        out.println("</head>");
        out.println("<body>");
        
        String amount = request.getParameter("amount");
        int count = Integer.parseInt(amount);
        boolean isFloat = true;
        
        ArrayList<String> isbn = new ArrayList<>();
        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> authors = new ArrayList<>();
        ArrayList<String> prices = new ArrayList<>();
        
        
        for (int i = 0; i < count; i++) {
            isbn.add((String)request.getParameter("isbn" + i));
            title.add((String)request.getParameter("title" + i));
            authors.add((String)request.getParameter("authors" + i));
            prices.add((String)request.getParameter("price" + i));
            
            try{
                Float.parseFloat((String)request.getParameter("price" + i));
            }catch(Exception e){
                isFloat=false;
                count--;
            }
        }
        
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/info6250?serverTimezone=UTC", "root", "123456");
            statement = connection.createStatement();
            for (int i = 0; i < count; i++) {
                String query = "insert into books (isbn, title, authors, price) value ('" + 
                        isbn.get(i) + "', '" + title.get(i) + "', '" + authors.get(i) + "', " + prices.get(i) + ")"; 
                int result = statement.executeUpdate(query);
                if (result < 0) {
                    throw new Exception("Add Failed!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if(isFloat){
            String s = Integer.toString(count);
            out.println("<p>" + s + " Books Added Successfully</p>");
        }else{
            String s = Integer.toString(count);
            out.println("<p>" + s + " Books Added Successfully</p>");
            out.println("<p>Please Enter Float for Price</p>");
        }
        out.println("<a href='hw2_part5.html'>Click here to Go Gack to Homepage</a>");
        out.println("</body>");
        out.println("</html>");
        
    }
}
