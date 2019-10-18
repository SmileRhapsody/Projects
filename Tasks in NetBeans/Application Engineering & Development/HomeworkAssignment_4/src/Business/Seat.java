/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.JOptionPane;

/**
 *
 * @author jhalak
 */
public class Seat {

    private String typeOfSeat;
    private Customer customer;
    private double margin;

    public String getTypeOfSeat() {
        return typeOfSeat;
    }

    public void setTypeOfSeat(String typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
        if(typeOfSeat.equals("W") || typeOfSeat.equals("window"))
        {
            margin=1.5;
        }
        else if(typeOfSeat.equals("A") || typeOfSeat.equals("aisle"))
        {
            margin=1.2;
        }
        else
        {
            margin=1;
        }
       
        
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }
    
     

}
