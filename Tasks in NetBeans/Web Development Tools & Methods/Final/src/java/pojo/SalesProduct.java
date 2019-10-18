/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Administrator
 */
public class SalesProduct {
    private int id;
    private String supplierName;
    private String name;
    private double buyingPrice;
    private double salingPrice;
    private int count;
    
    public SalesProduct(){}
    
    public SalesProduct(String supplierName,String name, double buyingPrice, double salingPrice, int count){
        this.supplierName = supplierName;
        this.name = name;
        this.buyingPrice = buyingPrice;
        this.salingPrice = salingPrice;
        this.count = count;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
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

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getSalingPrice() {
        return salingPrice;
    }

    public void setSalingPrice(double salingPrice) {
        this.salingPrice = salingPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
}
