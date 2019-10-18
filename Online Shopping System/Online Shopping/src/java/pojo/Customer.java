/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.HashSet;
import java.util.Set;
    
public class Customer {
    private int id;
    private String name;
    private String password;
    private Set orders;
    
    public Customer(){}
    
    public Customer(String name, String password){
        this.password=password;
        this.name=name;
        this.orders = new HashSet();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set getOrders() {
        return orders;
    }

    public void setOrders(Set orders) {
        this.orders = orders;
    }
    
    
}
