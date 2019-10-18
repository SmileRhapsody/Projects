package Business;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class part1_cart extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		Map<String,Integer> order = (Map<String,Integer>) session.getAttribute("order");
		if(order==null){
			order=new HashMap<String,Integer>();
		}
		String title = "View Cart";
		out.println("<html>");
        out.println("<head>");
        out.println("<title>"+title+"</title>");
        out.println("</head>");
        out.println("<body>");
		out.println("<form action='part1' method='get'>");
        out.println("<h1 align = 'center'>" + title +"</h1>");
		out.println("<table border=1 align='center'>");
		out.println("<tr bgcolor='#FFAD00'>");
		out.println("<th>Item Name<th>Amount");
		/*
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
			out.println("<tr><td>"+entry.getKey()+"\n<td>");
			out.println("<input type='text' name='"+entry.getKey()+"' value='"+entry.getValue()+"' ><br/>");
        }
		*/
		for(String s : order.keySet()){
			out.println("<tr><td>"+s+"\n<td>");
			out.println("<input type='text' name='"+s+"' value='"+order.get(s)+"' ><br/>");
		}
		out.println("</table>");
		out.println("<p><center><input type='submit' name='Update' value='Update'>");
		out.println("</form>");
		out.println("</body>");
        out.println("</html>");
	}
}