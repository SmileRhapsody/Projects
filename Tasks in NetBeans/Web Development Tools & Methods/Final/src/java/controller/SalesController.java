/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import dao.CustomerDao;
import dao.SalesDao;
import dao.SupplierDao;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import pojo.Customer;
import pojo.Order;
import pojo.ProductSummary;
import pojo.Sales;
import pojo.SalesProduct;
import pojo.Supplier;
import pojo.SupplierProduct;


/**
 *
 * @author Administrator
 */
public class SalesController extends AbstractController {
    
    public SalesController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String submit = request.getParameter("submit");
        String salesName = request.getParameter("salesName");
        ModelAndView mv = null;
        
        SalesDao sad = new SalesDao();
        Sales sales = sad.getSales(salesName);
        Set products = sales.getSalesProducts();
        SupplierDao sd = new SupplierDao();
        List<Supplier> suppliers = sd.getSuppliers();
        
        switch(submit){
            case "Add Products":
                mv = new ModelAndView("salesAdd","salesName",salesName);
                mv.addObject("suppliers", suppliers);
                break;
            case "Manage Products":
                mv = new ModelAndView("salesManage");
                mv.addObject("salesName",salesName);
                mv.addObject("products",products);
                break;
            case "Add":
                for(Supplier supplier:suppliers){
                    for(Object ob:supplier.getProducts()){
                        boolean exist = false;
                        SupplierProduct sp = (SupplierProduct)ob;
                        String addCount = request.getParameter(supplier.getSupplierName()+sp.getName()+"count");
                        if(!addCount.equals("")){
                            try{
                                Integer.parseInt(addCount);
                            }catch(Exception e){
                                return new ModelAndView("error","errorMessage","Please enter right format");
                            }
                            int count = Integer.parseInt(addCount);
                            if(count<=0||count>sp.getCount()){
                                return new ModelAndView("error","errorMessage","Please enter valid count");
                            }
                            for(Object o:products){
                                SalesProduct salesp = (SalesProduct)o;
                                if(salesp.getSupplierName().equals(supplier.getSupplierName())&&
                                        salesp.getName().equals(sp.getName())){
                                    exist=true;
                                    salesp.setCount(salesp.getCount()+count);
                                    break;
                                }
                            }
                            if(!exist){
                                SalesProduct salesproduct = new SalesProduct(supplier.getSupplierName(),sp.getName(),
                                    sp.getPrice(),sp.getPrice(),count);
                                products.add(salesproduct);
                            }
                            sp.setCount(sp.getCount()-count);
                        }
                    }
                    Iterator<SupplierProduct> it = supplier.getProducts().iterator();
                    while(it.hasNext()){
                        SupplierProduct sp = it.next();
                        if(sp.getCount()==0){
                        it.remove();
                        }
                    }
                    sd.updateProducts(supplier.getId(), supplier.getProducts());
                }
                int id = sales.getId();
                int addResult = sad.updateProducts(id, products);
                mv = new ModelAndView("addResult","result",addResult);
                mv.addObject("type", "Sales");
                mv.addObject("name",salesName);
                mv.addObject("password", sales.getPassword());
                mv.addObject("id",id);
                break;
            case "Manage":
                for(Object o: products){
                    SalesProduct sp = (SalesProduct)o;
                    try{
                        Double.parseDouble(request.getParameter(sp.getSupplierName()+sp.getName()));
                    }catch(Exception e){
                        return new ModelAndView("error","errorMessage","Please enter right format");
                    }
                    double sellingPrice = Double.parseDouble(request.getParameter(sp.getSupplierName()+sp.getName()));
                    if(sellingPrice<sp.getBuyingPrice()){
                        return new ModelAndView("error","errorMessage","Selling Price can not be less than buying price");
                    }
                    sp.setSalingPrice(sellingPrice);
                }
                int updateResult = sad.updateProducts(sales.getId(), products);
                mv = new ModelAndView("updateResult");
                mv.addObject("result",updateResult);
                mv.addObject("type", "Sales");
                mv.addObject("name",salesName);
                mv.addObject("password", sales.getPassword());
                mv.addObject("id",sales.getId());
                break;
            case "View Revenue":
                CustomerDao cd = new CustomerDao();
                List<Customer> customers = cd.getCustomers();
                List<ProductSummary> pss = new ArrayList<>();
                for(Customer c:customers){
                    for(Object o:c.getOrders()){
                        Order order = (Order)o;
                        if(order.getSalesName().equals(salesName)){
                            int duplicate = 0;
                            for(ProductSummary ps : pss){
                                if(ps.getSupplierName().equals(order.getSupplierName())
                                        && ps.getProductName().equals(order.getProductName())){
                                    duplicate = 1;
                                    ps.setRevenue(ps.getRevenue()+(order.getSalingPrice()
                                            -order.getBuyingPrice())*order.getCount());
                                    break;
                                }
                            }
                            if(duplicate == 0){
                                pss.add(new ProductSummary(order.getSupplierName(),order.getProductName()
                                ,(order.getSalingPrice()-order.getBuyingPrice())*order.getCount()));
                            }
                        }
                    }
                }
                pss.sort(new Comparator<ProductSummary>(){
                    @Override
                    public int compare(ProductSummary o1, ProductSummary o2) {
                       return new Double(o2.getRevenue()).compareTo(new Double(o1.getRevenue()));
                    }
                });
                mv = new ModelAndView("salesRevenue");
                mv.addObject("productSummary", pss);
                mv.addObject("type", "Sales");
                mv.addObject("name",salesName);
                mv.addObject("password", sales.getPassword());
                mv.addObject("id",sales.getId());
                break;
            case "Main Menu":
                mv = new ModelAndView("role");
                break;
        }
        return mv;
    }
}
