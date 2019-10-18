/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Administrator
 */
public class Sales {
    private int id;
    private String name;
    private String password;
    private Set salesProducts;

    public Sales(){}
    
    public Sales(String name, String password){
        this.password=password;
        this.name=name;
        this.salesProducts = new HashSet();
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

    public Set getSalesProducts() {
        return salesProducts;
    }

    public void setSalesProducts(Set salesProducts) {
        this.salesProducts = salesProducts;
    }
    
    
}
