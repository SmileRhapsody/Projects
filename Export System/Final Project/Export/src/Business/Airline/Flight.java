/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;



/**
 *
 * @author raoyuhuizi
 */
public class Flight {
    private String flightnumber;
    private String cty;
    private String enterpriseName;
    private double shippingFee;
    private int price;
    
    public Flight(){}
    
    public Flight(String name, String cty, double shippingFee,int price, String enterpriseName){
        flightnumber = name;
        this.cty = cty;
        this.shippingFee = shippingFee;
        this.price = price;
        this.enterpriseName = enterpriseName;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(double shippingFee) {
        this.shippingFee = shippingFee;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return cty;
    }
}
