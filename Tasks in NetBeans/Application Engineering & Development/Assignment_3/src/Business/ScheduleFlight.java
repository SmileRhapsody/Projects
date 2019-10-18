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
public class ScheduleFlight {
    private ArrayList<Flight> selectedFlightList;
    
    public ScheduleFlight(){
        selectedFlightList = new ArrayList<>();
    }

    public ArrayList<Flight> getSelectedFlightList() {
        return selectedFlightList;
    }

    public void setSelectedFlightList(ArrayList<Flight> selectedFlightList) {
        this.selectedFlightList = selectedFlightList;
    }
    
    public Flight add(){
        Flight flight = new Flight();
        selectedFlightList.add(flight);
        return flight;
    }
     
    public Flight search(String flightName){
        for (Flight flight: selectedFlightList){
            if(flightName.equals(flight.getFlightName())){
                return flight;
            }
        }
        return null;
    }
    
    public void remove(Flight flight) {
        selectedFlightList.remove(flight);
    }
}
