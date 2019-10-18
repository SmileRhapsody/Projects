/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Order.OrderList;
import java.util.ArrayList;
import java.util.List;

;

/**
 *
 * @author raoyuhuizi
 */
public class Customer {
    private String name;
    private int id;
    private String address;
    private float phoneNumber;
    private OrderList orderList;
    
    public Customer(){
        orderList = new OrderList();
    }
    public Customer(int id, String name, String address, float phoneNumber){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        orderList = new OrderList();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(float phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }


}
