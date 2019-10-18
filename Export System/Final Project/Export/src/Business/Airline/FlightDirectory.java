/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import java.util.ArrayList;

/**
 *
 * @author raoyuhuizi
 */
public class FlightDirectory {
    private ArrayList<Flight> fltList;
    
    public FlightDirectory(){
        fltList=new ArrayList();
    }

    public ArrayList<Flight> getFltList() {
        return fltList;
    }
    
//    public Flight createFlight(String cty,double time,double capacity){
//        Flight flt=new Flight();
//        flt.setCty(cty);
//        flt.setTime(time);
//        flt.setCapacity(capacity);
//        fltList.add(flt);
//        return flt;
//    }
    
    public Flight addFlight() {
        Flight f = new Flight();
        fltList.add(f);
        return f;
    }
    
    public void addFlight(Flight f) {
        fltList.add(f);
    }
   
      public void removeFlight(Flight p) {
        fltList.remove(p);
    }
    public Flight searchFlightString(String sss) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Flight p : fltList) {
             if(p.getFlightnumber().equals(sss)||p.getCty().equals(sss)) 
                return p;        
        }
        return null;
    }
    
}
