/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class part3 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String fileName = request.getParameter("file");
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Read CSV</title>");
        out.println("</head>");
        out.println("<body>");
        //out.println(request.getRealPath("file/")+fileName);
        //out.println(fileName);
        out.println("<h1 align = 'center'>Read Excel</h1>");
        
        try {
	    FileInputStream fis = new FileInputStream(new File(fileName));
            //FileInputStream fis = new FileInputStream(new File(request.getRealPath("file/")+fileName));
	    HSSFWorkbook workbook = new HSSFWorkbook(fis);
            
            for (int n = 0; n < workbook.getNumberOfSheets(); n++) {
            
            out.println("<table border=1 align='center'>");
            out.println("<tr bgcolor='#FFAD00'>");
            HSSFSheet sheet = workbook.getSheetAt(n);
            Iterator<Row> rowIterator = sheet.iterator();
            Row row0 = rowIterator.next();
            Iterator<Cell> cellIterator0 = row0.cellIterator(); 
            while (cellIterator0.hasNext()) { 
                Cell cell = cellIterator0.next(); 
                switch (cell.getCellType()) { 
                    case NUMERIC: 
                        out.print("<th>"+cell.getNumericCellValue()); 
                        break; 
                    case STRING: 
                        out.print("<th>"+cell.getStringCellValue()); 
                        break; 
                } 
            }

            while (rowIterator.hasNext()) { 
                Row row = rowIterator.next(); 
                Iterator<Cell> cellIterator = row.cellIterator(); 
                out.print("<tr>");
                while (cellIterator.hasNext()) { 
                    Cell cell = cellIterator.next(); 
                    switch (cell.getCellType()) { 
                        case NUMERIC:
                            if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                                Date date = cell.getDateCellValue();  
                                out.print("<td>"+sdf.format(date));
                            } else {
                                double value = cell.getNumericCellValue();  
                                CellStyle style = cell.getCellStyle();  
                                DecimalFormat format = new DecimalFormat();  
                                String temp = style.getDataFormatString();   
                                if (temp.equals("General")) {  
                                    format.applyPattern("#");  
                                }   
                                out.print("<td>"+format.format(value));
                                //out.print("<td>"+cell.getNumericCellValue()); 
                            }
                            break; 
                        case STRING: 
                            out.print("<td>"+cell.getStringCellValue()); 
                            break; 
                    } 
                } 
            }
            out.println("</table><br/>");
            }
            
            workbook.close();
            fis.close();
            
	}catch(NullPointerException e) {
	    System.out.println("no value");
        }
        
        out.println("</body>");
        out.println("</html>");
    }
}
