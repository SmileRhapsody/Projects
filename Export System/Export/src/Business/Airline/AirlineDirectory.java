/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;

import java.util.ArrayList;

;

/**
 *
 * @author raoyuhuizi
 */

public class AirlineDirectory {
    private ArrayList<Airline> alList;
    
    public AirlineDirectory(){
    alList=new ArrayList();
    }

    public ArrayList<Airline> getAlList() {
        return alList;
    }
//    public Airline createAirline(String alName,int number){
//        Airline al=new Airline();
//        al.setAlName(alName);
//        
//        al.setNum(number);
//        alList.add(al);
//        return al;
//    }
    
    
//    public ArrayList<Airline> setAlList(ArrayList<Airline> al) {
//        alList=al;
//        return alList;
//    }
    
    public Airline addAirline(){
        Airline al=new Airline();
        alList.add(al);
        return al;
    }
    
     public void setAirList(ArrayList<Airline> airList) {
        alList = airList;
    }
    
    public void removeFlight(Airline s) {
        alList.remove(s);
    }
    
    
}

