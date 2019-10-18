/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Administrator
 */
public class Airplane {
    private String airlinerName;
    private String airplaneName;
    private double airplaneSize;
    private FlightDirectory flightdirectory;
    
    public Airplane (){
        flightdirectory = new FlightDirectory();
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public double getAirplaneSize() {
        return airplaneSize;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public void setAirplaneSize(double airplaneSize) {
        this.airplaneSize = airplaneSize;
    }
    
    public FlightDirectory getFlightdirectory() {
        return flightdirectory;
    }

    public void setFlightdirectory(FlightDirectory flightdirectory) {
        this.flightdirectory = flightdirectory;
    }

    @Override
    public String toString() {
        return airplaneName;
    }

    
    
}
