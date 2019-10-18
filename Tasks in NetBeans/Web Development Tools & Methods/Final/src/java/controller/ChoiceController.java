/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CustomerDao;
import dao.SalesDao;
import dao.SupplierDao;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import pojo.Customer;
import pojo.Order;
import pojo.Sales;
import pojo.Summary;
import pojo.Supplier;

/**
 *
 * @author Administrator
 */
public class ChoiceController extends AbstractController {
    
    public ChoiceController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        String page = request.getParameter("page");
        
        if(page.equals("role")){
            String submit = request.getParameter("submit");
            if(submit.equals("Revenue Summary")){
                List<Summary> summaries = new ArrayList<>();
                SalesDao sd = new SalesDao();
                List<Sales> salesList = sd.getSales();
                for(Sales s: salesList){
                    summaries.add(new Summary(s.getName(),0));
                }
                CustomerDao cd = new CustomerDao();
                List<Customer> customers = cd.getCustomers();
                for(Customer c:customers){
                    for(Object o:c.getOrders()){
                        Order order = (Order)o;
                        for(Summary s:summaries){
                            if(s.getSalesName().equals(order.getSalesName())){
                                s.setRevenue(s.getRevenue()+(order.getSalingPrice()-order.getBuyingPrice())*order.getCount());
                            }
                        }
                    }
                }
                summaries.sort(new Comparator<Summary>(){
                    @Override
                    public int compare(Summary o1, Summary o2) {
                       return new Double(o2.getRevenue()).compareTo(new Double(o1.getRevenue()));
                    }
                });
                return new ModelAndView("summary","summaries",summaries);
            }else{
                String type = request.getParameter("type");
                return new ModelAndView("entry", "type", type);
            }
        }else{
            String type = request.getParameter("type");
            String submit = request.getParameter("submit");
            switch(type){
                case "Supplier":
                    String supplierName = request.getParameter("name");
                    String password = request.getParameter("password");
                    if(supplierName.isEmpty()||password.isEmpty()){
                        return new ModelAndView("error","errorMessage","Uer name or password can not be empty");
                    }
                    SupplierDao sd = new SupplierDao();
                    if(submit.equals("Register")){
                        if(sd.getSupplier(supplierName)!=null){
                            return new ModelAndView("error","errorMessage","Uer name is existing");
                        }
                        Supplier s = new Supplier(supplierName, password);
                        int result = sd.addSupplier(s);
                        ModelAndView mv =  new ModelAndView("registerSuccess", "result" , result);
                        mv.addObject("type", type);
                        return mv;
                    }else {
                        Supplier s = sd.getSupplier(supplierName, password);
                        if(s==null){
                            return new ModelAndView("error","errorMessage","Yout uer name or password is wrong");
                        }
                        ModelAndView mv = new ModelAndView("supplierInterface");
                        int id = s.getId();
                        mv.addObject("supplierName", supplierName);
                        mv.addObject("id", id);
                        return mv;
                    }
                case "Sales":
                    String salesName = request.getParameter("name");
                    String salesPassword = request.getParameter("password");
                    if(salesName.isEmpty()||salesPassword.isEmpty()){
                        return new ModelAndView("error","errorMessage","Uer name or password can not be empty");
                    }
                    SalesDao sad = new SalesDao();
                    if(submit.equals("Register")){
                        if(sad.getSales(salesName)!=null){
                            return new ModelAndView("error","errorMessage","Uer name is existing");
                        }
                        Sales s = new Sales(salesName, salesPassword);
                        int result = sad.addSales(s);
                        ModelAndView mv =  new ModelAndView("registerSuccess", "result" , result);
                        mv.addObject("type", type);
                        return mv;
                    }else {
                        Sales s = sad.getSales(salesName, salesPassword);
                        if(s==null){
                            return new ModelAndView("error","errorMessage","Yout uer name or password is wrong");
                        }
                        ModelAndView mv = new ModelAndView("salesInterface");
                        mv.addObject("salesName", salesName);
                        mv.addObject("id", s.getId());
                        return mv;
                    }
                case "Customer":
                    String customerName = request.getParameter("name");
                    String customerPassword = request.getParameter("password");
                    if(customerName.isEmpty()||customerPassword.isEmpty()){
                        return new ModelAndView("error","errorMessage","Uer name or password can not be empty");
                    }
                    CustomerDao cd = new CustomerDao();
                    if(submit.equals("Register")){
                        if(cd.getCustomer(customerName)!=null){
                            return new ModelAndView("error","errorMessage","Uer name is existing");
                        }
                        Customer c = new Customer(customerName, customerPassword);
                        int result = cd.addCustomer(c);
                        ModelAndView mv =  new ModelAndView("registerSuccess", "result" , result);
                        mv.addObject("type", type);
                        return mv;
                    }else {
                        Customer c = cd.getCustomer(customerName, customerPassword);
                        if(c==null){
                            return new ModelAndView("error","errorMessage","Yout uer name or password is wrong");
                        }
                        ModelAndView mv = new ModelAndView("customerInterface");
                        mv.addObject("customerName", customerName);
                        mv.addObject("id", c.getId());
                        return mv;
                    }
                default:
                    return null;
            }  
        }
    }
    
}
