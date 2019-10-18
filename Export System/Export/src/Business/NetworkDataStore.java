/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Airline.Flight;
import Business.Customer.CustomerDirectory;
import Business.Supplier.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class NetworkDataStore {
    private List<String> countryList;
    private List<Flight> fliList;
    private CustomerDirectory customerdirectory;
    private List<Product> proList;
    
    public NetworkDataStore(){
        countryList = new ArrayList<>();
        fliList=new ArrayList<>();
        customerdirectory = new CustomerDirectory();
        proList = new ArrayList<>();
    }

    public List<String> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<String> countryList) {
        this.countryList = countryList;
    }

    
    public List<Flight> getFliList() {
        return fliList;
    }

    public void setFliList(List<Flight> fliList) {
        this.fliList = fliList;
    }
    
    public CustomerDirectory getCustomerdirectory() {
        return customerdirectory;
    }

    public List<Product> getProList() {
        return proList;
    }

    public void setProList(List<Product> proList) {
        this.proList = proList;
    }


}
