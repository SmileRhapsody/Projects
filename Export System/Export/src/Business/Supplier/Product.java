/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;



/**
 *
 * @author raoyuhuizi
 */
public class Product {
    private String name;
    private int id;
    private static int count=1;
    private double originPrice;
    private double shippingCost;
    private double sellPrice;
    private int num;
    private double size;
    private String supplierName;
    private double revenue;
    
    public Product(){
        id=count;
        count++;
    }
    
    public Product(String name, double originPrice, int num,String supplierName){
        id = count++;
        this.name = name;
        this.originPrice = originPrice;
        this.num = num;
        this.supplierName = supplierName;
    }
    
     public Product(String name, double originPrice, int num,double size,String supplierName){
        id = count++;
        this.name = name;
        this.originPrice = originPrice;
        this.num = num;
        this.size=size;
        this.supplierName = supplierName;
    }
    
     public Product(String name, double originPrice, double sellPrice, int num,double size,String supplierName){
         this.name = name;
        this.originPrice = originPrice;
        this.sellPrice = sellPrice;
        this.num = num;
        this.size=size;
        this.supplierName = supplierName;
     }
     
     public Product(String name, double sellPrice,String supplierName){
        this.name = name;
        this.sellPrice = sellPrice;
        this.supplierName = supplierName;
     }
     
     public Product(String name,String supplierName, double revenue){
         this.name = name;
         this.supplierName = supplierName;
         this.revenue = revenue;
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

    public double getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(double originPrice) {
        this.originPrice = originPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
    
    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
