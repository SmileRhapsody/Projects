/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dao.CustomerDao;
import dao.SalesDao;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import pojo.Customer;
import pojo.Order;
import pojo.Sales;
import pojo.SalesProduct;

public class CustomerController extends AbstractController {
    
    public CustomerController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String submit = request.getParameter("submit");
        String customerName = request.getParameter("customerName");
        ModelAndView mv = null;
        
        SalesDao sd = new SalesDao();
        List<Sales> salesList = sd.getSales();
        CustomerDao cd = new CustomerDao();
        Customer c = cd.getCustomer(customerName);
        Set orders = c.getOrders();
        
        switch(submit){
            case "Add Products":
                mv = new ModelAndView("customerAdd","customerName",customerName);
                mv.addObject("salesList", salesList);
                break;
            case "Browse Orders":
                mv = new ModelAndView("customerManage");
                mv.addObject("customerName",customerName);
                mv.addObject("orders",orders);
                mv.addObject("type", "Customer");
                mv.addObject("password", c.getPassword());
                mv.addObject("name",customerName);
                break;
            case "Buy":
                for(Sales s:salesList){
                    for(Object o:s.getSalesProducts()){
                        SalesProduct sp = (SalesProduct)o;
                        String buyCount = request.getParameter(s.getName()+sp.getSupplierName()+sp.getName()+"count");
                        if(!buyCount.equals("")){
                            try{
                                Integer.parseInt(buyCount);
                            }catch(Exception e){
                                return new ModelAndView("error","errorMessage","Please enter right format");
                            }
                            int count = Integer.parseInt(buyCount);
                            if(count<0||count>sp.getCount()){
                                return new ModelAndView("error","errorMessage","Please enter valid count");
                            }
                            Order order = new Order(s.getName(),sp.getSupplierName(),sp.getName(),
                                sp.getBuyingPrice(),sp.getSalingPrice(),count);
                            orders.add(order);
                            sp.setCount(sp.getCount()-count);
                        }
                    }
                    Iterator<SalesProduct> it = s.getSalesProducts().iterator();
                    while(it.hasNext()){
                        SalesProduct sp = it.next();
                        if(sp.getCount()==0){
                        it.remove();
                        }
                    }
                    sd.updateProducts(s.getId(), s.getSalesProducts());
                }
                int addResult = cd.updateOrders(c.getId(), orders);
                mv = new ModelAndView("addResult","result",addResult);
                mv.addObject("type", "Customer");
                mv.addObject("password", c.getPassword());
                mv.addObject("name",customerName);
                mv.addObject("id",c.getId());
                break;
            case "Main Menu":
                mv = new ModelAndView("role");
                break;
        }
        return mv;
    }
}
