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
public class AirplaneDirectory {
    private ArrayList<Airplane> airplaneList;
    
    public AirplaneDirectory(){
        airplaneList = new ArrayList<>();
    }

    public ArrayList<Airplane> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(ArrayList<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }
    
    public Airplane add(){
        Airplane airplane = new Airplane();
        airplaneList.add(airplane);
        return airplane;
    }
     
    public Airplane search(String airplaneName){
        for (Airplane airplane: airplaneList){
            if(airplaneName.equals(airplane.getAirplaneName())){
                return airplane;
            }
        }
        return null;
    }
    
    public void remove(Airplane airplane) {
        airplaneList.remove(airplane);
    }
}
