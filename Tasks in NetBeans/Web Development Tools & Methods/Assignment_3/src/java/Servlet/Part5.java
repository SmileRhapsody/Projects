package Servlet;

import Business.Item;
import Business.Order;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Part5 extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        
        HttpSession session = request.getSession();
        Order order = (Order) session.getAttribute("order");
        if(order==null){
            order = new Order();
        }
        for(Item item: order.getOrders()){
            item.setCount(Integer.parseInt(request.getParameter(item.getName())));
        }
        Iterator<Item> it = order.getOrders().iterator();
        while(it.hasNext()){
            Item i = it.next();
            if(i.getCount()==0){
                it.remove();
            }
        }
        session.setAttribute("order",order);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("part5_cart.jsp");
        requestDispatcher.forward(request, response);
    }
	
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	response.setContentType("text/html");
	
	String[] paramValues = request.getParameterValues("book");
	if(paramValues == null)
            paramValues = request.getParameterValues("music");
        if(paramValues == null)
            paramValues = request.getParameterValues("computer");
        
	HttpSession session = request.getSession();
	Order order = (Order)session.getAttribute("order");
	if(order==null){
            order = new Order();
	}
	for(String s : paramValues){
            Item item = order.find(s);
            if(item == null){
                order.add(new Item(s,1));
            }else{
                item.setCount(item.getCount()+1);
            }
        }
        session.setAttribute("order",order);
        request.setAttribute("paramValues", paramValues);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("part5_view.jsp");
        requestDispatcher.forward(request, response);
    }
}