/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

;

/**
 *
 * @author raoyuhuizi
 */
public class CustomerDirectory {
    private ArrayList<Customer> cusList;
    
    public CustomerDirectory(){
        cusList=new ArrayList();
    }

    public ArrayList<Customer> getCusList() {
        return cusList;
    }
}
