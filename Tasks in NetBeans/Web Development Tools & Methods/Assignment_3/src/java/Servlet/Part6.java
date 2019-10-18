/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class Part6 extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        String fileName = request.getParameter("fileName");
        
        List<List<String>> csvData = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        
        try {
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            Connection connection = DriverManager.getConnection("jdbc:relique:csv:D:\\Backup\\Documents\\NetBeansProjects\\Assignment_3\\");
            Statement stm = connection.createStatement();
            ResultSet results = stm.executeQuery("select * from " + fileName);
            
            ResultSetMetaData data = results.getMetaData();
            int columnCount = data.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String title = data.getColumnName(i);
                titleList.add(title);
            }

            for(int i = 0; i < columnCount; i++){
                csvData.add(new ArrayList<>());
            }
            while (results.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String d = results.getString(i);
                    csvData.get(i-1).add(d);
                }     
            }
            
            results.close();
            stm.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        request.setAttribute("csvData", csvData);
        request.setAttribute("titleList", titleList);
        request.getRequestDispatcher("part6_csv.jsp").forward(request, response);
        
        
//        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Display CSV</title>");            
//        out.println("</head>");
//        out.println("<body bgcolor='#00FF00'>");
//        out.println("<table border=1 align=\"center\">");
//        out.println("<tr>");
//        titleList.forEach((s) -> {
//            out.println("<th>"+s);
//        });
//        for(int i = 0; i < csvData.get(0).size(); i++){
//            out.println("<tr/>");
//            for(int j = 0; j<csvData.size(); j++){
//                out.println("<td/>"+csvData.get(j).get(i));
//            }
//        }
//        out.println("</table>");
//        out.println("</body>");
//        out.println("</html>");
    }
}
