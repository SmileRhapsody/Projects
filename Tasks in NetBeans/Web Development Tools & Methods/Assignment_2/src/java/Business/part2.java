package Business;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import org.relique.jdbc.csv.CsvDriver;

public class part2 extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String fileName = request.getParameter("fileName");
        
        try {
            Class.forName("org.relique.jdbc.csv.CsvDriver");
            Connection conn = DriverManager.getConnection("jdbc:relique:csv:D:\\Backup\\Documents\\NetBeansProjects\\Assignment_2\\");
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT SalesOrderID,RevisionNumber,OrderDate,DueDate,ShipDate,Status,OnlineOrderFlag,SalesOrderNumber,"
                    + "PurchaseOrderNumber,AccountNumber,CustomerID,SalesPersonID,TerritoryID,BillToAddressID,ShipToAddressID,ShipMethodID,CreditCardID,"
                    + "CreditCardApprovalCode,CurrencyRateID,SubTotal,TaxAmt,Freight,TotalDue,Comment,ModifiedDate FROM "+ fileName);
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Read CSV</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align = 'center'>Read CSV</h1>");
            out.println("<table border=1 align='center'>");
            out.println("<tr bgcolor='#FFAD00'>");
            out.println("<th>SalesOrderID<th>RevisionNumber<th>OrderDate<th>DueDate<th>ShipDate<th>Status<th>OnlineOrderFlag<th>SalesOrderNumber"
                    + "<th>PurchaseOrderNumber<th>AccountNumber<th>CustomerID<th>SalesPersonID<th>TerritoryID<th>BillToAddressID<th>ShipToAddressID<th>ShipMethodID"
                    + "<th>CreditCardID<th>CreditCardApprovalCode<th>CurrencyRateID<th>SubTotal<th>TaxAmt<th>Freight<th>TotalDue<th>Comment<th>ModifiedDate");
            while (results.next()){
                out.println("<tr><td>"+results.getString("SalesOrderID")+"\n<td>"+results.getString("RevisionNumber")
                +"\n<td>"+results.getString("OrderDate")+"\n<td>"+results.getString("DueDate")
                +"\n<td>"+results.getString("ShipDate")+"\n<td>"+results.getString("Status")
                +"\n<td>"+results.getString("OnlineOrderFlag")+"\n<td>"+results.getString("SalesOrderNumber")
                +"\n<td>"+results.getString("PurchaseOrderNumber")+"\n<td>"+results.getString("AccountNumber")
                +"\n<td>"+results.getString("CustomerID")+"\n<td>"+results.getString("SalesPersonID")
                +"\n<td>"+results.getString("TerritoryID")+"\n<td>"+results.getString("BillToAddressID")
                +"\n<td>"+results.getString("ShipToAddressID")+"\n<td>"+results.getString("ShipMethodID")+"\n<td>"+results.getString("CreditCardID")
                +"\n<td>"+results.getString("CreditCardApprovalCode")+"\n<td>"+results.getString("CurrencyRateID")
                +"\n<td>"+results.getString("SubTotal")+"\n<td>"+results.getString("TaxAmt")
                +"\n<td>"+results.getString("Freight")+"\n<td>"+results.getString("TotalDue")
                +"\n<td>"+results.getString("Comment")+"\n<td>"+results.getString("ModifiedDate"));
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            
            CsvDriver.writeToCsv(results, System.out, true);
            results.close();
            stmt.close();
            conn.close();
        }catch(Exception e){
            System.out.println("Oops-> " + e);
        }
    }
}
