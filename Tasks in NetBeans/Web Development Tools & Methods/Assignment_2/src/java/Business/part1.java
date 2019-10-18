package Business;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class part1 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		Map<String,Integer> order = (Map<String,Integer>)session.getAttribute("order");
		if(order==null){
			order=new HashMap<String,Integer>();
		}
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()){
			String name = names.nextElement();
			if(name.equals("Update")) continue;
			order.put(name, Integer.parseInt(request.getParameter(name)));
		}
		for(Iterator<Map.Entry<String,Integer>> it = order.entrySet().iterator(); it.hasNext();){
			Map.Entry<String,Integer> entry = it.next();
			if(entry.getValue()==0){
				it.remove();
			}
		}
		session.setAttribute("order",order);
		request.getRequestDispatcher("part1_cart").forward(request,response);
		
		
	}
	
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
	
		String[] paramValues = request.getParameterValues("book");
		if(paramValues == null)
			paramValues = request.getParameterValues("music");
		if(paramValues == null)
			paramValues = request.getParameterValues("computer");
		
		String title = "Order";
		out.println("<html>");
        out.println("<head>");
        out.println("<title>"+title+"</title>");
        out.println("</head>");
        out.println("<body bgcolor='#FDF5E6'>");
        out.println("<h1 align = 'center'>" + title +"</h1>");
		
		for(String s : paramValues){
			out.println(s+"<br/>");
		}
		out.println("<p><a href='part1_cart'>View Cart</a>");
		out.println("<a href='hw2_part1_book.html'>Go to Book Page</a>");
		out.println("<a href='hw2_part1_music.html'>Go to Music Page</a>");
		out.println("<a href='hw2_part1_computer.html'>Go to Computer Page</a>");
		out.println("</body>");
        out.println("</html>");
		
		HttpSession session = request.getSession();
		Map<String,Integer> order = (Map<String,Integer>) session.getAttribute("order");
		if(order==null){
			order = new HashMap<String,Integer>();
		}
		for(String s : paramValues){
			if(order.containsKey(s)){
				int number = order.get(s);
				order.put(s, number+1);
			}else{
				order.put(s,1);
			}
		}
		session.setAttribute("order",order);
    }
}