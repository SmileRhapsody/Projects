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
public class Order {
    private int id;
    private String salesName;
    private String supplierName;
    private String productName;
    private double buyingPrice;
    private double salingPrice;
    private int count;
    
    public Order(){}
    
    public Order(String salesName, String supplierName, String productName, 
            double buyingPrice, double salingPrice, int count){
        this.salesName = salesName;
        this.supplierName = supplierName;
        this.productName = productName;
        this.buyingPrice = buyingPrice;
        this.salingPrice = salingPrice;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalesName() {
        return salesName;
    }

    public void setSalesName(String salesName) {
        this.salesName = salesName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
