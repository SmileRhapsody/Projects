/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Order {
    private ArrayList<Item> orders;
    
    public Order(){
        orders=new ArrayList<>();
    }

    public ArrayList<Item> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Item> orders) {
        this.orders = orders;
    }
    
    public void add(Item item){
        orders.add(item);
    }
    
    public Item find(String s){
        for(Item i : orders){
            if(s.equals(i.getName())){
                return i;
            }
        }
        return null;
    }
}
