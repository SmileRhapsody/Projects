/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SupplierDao;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import pojo.Supplier;
import pojo.SupplierProduct;

/**
 *
 * @author Administrator
 */
public class SupplierController extends AbstractController {
    public SupplierController() {
    }
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String submit = request.getParameter("submit");
        String supplierName = request.getParameter("supplierName");
        ModelAndView mv = null;
        
        SupplierDao sd = new SupplierDao();
        Supplier supplier = sd.getSupplier(supplierName);
        Set products = supplier.getProducts();
        
        switch(submit){
            case "Add Products":
                mv = new ModelAndView("supplierAdd","supplierName",supplierName);
                break;
            case "View Products":
                mv = new ModelAndView("supplierManage");
                mv.addObject("supplierName",supplierName);
                mv.addObject("products",products);
                mv.addObject("type", "Supplier");
                mv.addObject("name",supplierName);
                mv.addObject("password", supplier.getPassword());
                break;
            case "Add":
                String name = request.getParameter("name");
                String strPrice = request.getParameter("price");
                String strCount = request.getParameter("count");
                if(name.isEmpty()||strPrice.isEmpty()||strCount.isEmpty()){
                    return new ModelAndView("error","errorMessage","Please fill the blank");
                }
                try{
                    Double.parseDouble(strPrice);
                    Integer.parseInt(strCount);
                }catch(Exception e){
                    return new ModelAndView("error","errorMessage","Please enter right format");
                }
                double price = Double.parseDouble(strPrice);
                int count = Integer.parseInt(strCount);
                if(price<=0){
                    return new ModelAndView("error","errorMessage","Price must be greater than 0");
                }
                if(count<=0){
                    return new ModelAndView("error","errorMessage","Count must be greater than 0");
                }
                int id = supplier.getId();
                products.add(new SupplierProduct(name,price,count));
                int addResult = sd.updateProducts(id, products);
                
                mv = new ModelAndView("addResult","result",addResult);
                mv.addObject("type", "Supplier");
                mv.addObject("name",supplierName);
                mv.addObject("id",id);
                mv.addObject("password", supplier.getPassword());
                break;
//            case:"Manage":
//                for(Object o:products){
//                    SupplierProduct sp = (SupplierProduct)o;
//                    String pName = sp.getName();
//                    String stPrice = request.getParameter(pName+"price");
//                    String stCount = request.getParameter(pName+"count");
//                    try{
//                        Double.parseDouble(stPrice);
//                        Integer.parseInt(stCount);
//                    }catch(Exception e){
//                        return new ModelAndView("error","errorMessage","Please enter right format");
//                    }
//                    double pPrice = Double.parseDouble(stPrice);
//                    int pCount = Integer.parseInt(stCount);
//                    if(pPrice<=0||pCount<0){
//                        return new ModelAndView("error","errorMessage","Please enter valid number");
//                    }
//                    sp.setPrice(pPrice);
//                    sp.setCount(pCount);
//                }
//                Iterator<SupplierProduct> it = products.iterator();
//                    while(it.hasNext()){
//                        SupplierProduct sp = it.next();
//                        if(sp.getCount()==0){
//                        it.remove();
//                        }
//                    }
//                int updateResult = sd.updateProducts(supplier.getId(), products);
//                
//                mv = new ModelAndView("updateResult");
//                mv.addObject("result",updateResult);
//                mv.addObject("type", "Supplier");
//                mv.addObject("name",supplierName);
//                mv.addObject("id",supplier.getId());
//                mv.addObject("password", supplier.getPassword());
//                break;
            case "Main Menu":
                mv = new ModelAndView("role");
                break;
        }
        return mv;
    }
}
