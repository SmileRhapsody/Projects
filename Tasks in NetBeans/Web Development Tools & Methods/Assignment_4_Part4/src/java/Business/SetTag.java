/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.IOException;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import pojo.FileData;

/**
 *
 * @author Administrator
 */
public class SetTag extends SimpleTagSupport{
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    StringWriter sw = new StringWriter();
    
    public void doTag() throws JspException, IOException {

        JspWriter out = getJspContext().getOut();

        try{
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            Connection connection = DriverManager.getConnection("jdbc:relique:csv:D:\\Backup\\Documents\\NetBeansProjects\\Assignment_3\\");
            Statement stm = connection.createStatement();
            ResultSet results = stm.executeQuery("select * from " + fileName);
            ResultSetMetaData metaData = results.getMetaData();
            int count = metaData.getColumnCount();
            
            FileData data = new FileData();
            
            for (int i = 1; i <= count; i++) {
                data.getTitle().add(metaData.getColumnName(i));
            }
            while(results.next()){
                String[] row = new String[count];
                for (int i = 1; i <= count; i++) {
                    row[i-1] = results.getString(i);
                }
                data.getData().add(row);
            }
            
            out.println("<center><h1>Read CSV: "+fileName+"</h1></center>");
            out.println("<table border=1>");
            out.println("<tr/>");
            for(String title : data.getTitle()){
                out.println("<th/>" + title);
            }
            for(String[] row : data.getData()){
                out.println("<tr/>");
                for(String value : row){
                    out.println("<td/>" + value);
                }
            }
            out.println("</table>");
            
            results.close();
            stm.close();
            connection.close();
        }catch (ClassNotFoundException | SQLException e) {
            out.println("<center><h1> Read CSV </h1></center>");
        }
  }
}
