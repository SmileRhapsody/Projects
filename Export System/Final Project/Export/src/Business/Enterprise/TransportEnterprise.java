/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

import Business.Airline.Flight;
import Business.Airline.FlightDirectory;
import Business.EnterpriseDataStore;
/**
 *
 * @author peichun
 */
public class TransportEnterprise extends Enterprise{
    
    private FlightDirectory fltList;
    public TransportEnterprise(String name){
        super(name,EnterpriseType.Transport);
        fltList=new FlightDirectory();
    }
    
    public FlightDirectory getFltList() {
        return fltList;
    }

    public void setFltList(FlightDirectory fltList) {
        this.fltList = fltList;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
}
