/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Supplier.Product;
import Business.Airline.Flight;
import Business.Order.OrderList;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author raoyuhuizi
 */

public class EnterpriseDataStore {
    private List<String> countryList;
    private List<Product> proList;
    private List<Flight> fliList;
    private OrderList orderList;
//    private ArrayList<Airline> airList;
//    private ArrayList<Supplier> supList;
    
    public EnterpriseDataStore(){
        countryList = new ArrayList<>();
        proList = new ArrayList<>();
        fliList=new ArrayList<>();
        orderList  = new OrderList();
//        airList=new ArrayList<>();
//        supList= new ArrayList<>();
    }

    public List<String> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<String> countryList) {
        this.countryList = countryList;
    }
    public List<Product> getProList() {
        return proList;
    }

    public void setProList(List<Product> proList) {
        this.proList = proList;
    }
    
    public List<Flight> getFliList() {
        return fliList;
    }

    public void setFliList(List<Flight> fliList) {
        this.fliList = fliList;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }
}
