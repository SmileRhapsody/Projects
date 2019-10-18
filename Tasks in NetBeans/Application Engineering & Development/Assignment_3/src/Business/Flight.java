/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Flight {
    private String flightName;
    private String fLocation;
    private String tLocation;
    private String time;
    private Date dTime;
    private Date aTime;
    private SeatDirectory seatdirectory;
    private String airlinerName;
    private String airplaneName;
    private CustomerDirectory customerdirectory;
    
    public Flight(){
        seatdirectory = new SeatDirectory();
        customerdirectory = new CustomerDirectory();
        dTime = new Date();
        aTime = new Date();
    }
    
    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    
    public String getfLocation() {
        return fLocation;
    }

    public void setfLocation(String fLocation) {
        this.fLocation = fLocation;
    }

    public String gettLocation() {
        return tLocation;
    }

    public void settLocation(String tLocation) {
        this.tLocation = tLocation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public SeatDirectory getSeatdirectory() {
        return seatdirectory;
    }

    public void setSeatdirectory(SeatDirectory seatdirectory) {
        this.seatdirectory = seatdirectory;
    }

    public Date getdTime() {
        return dTime;
    }

    public void setdTime(Date sTime) {
        this.dTime = sTime;
    }

    public Date getaTime() {
        return aTime;
    }

    public void setaTime(Date aTime) {
        this.aTime = aTime;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public CustomerDirectory getCustomerdirectory() {
        return customerdirectory;
    }

    public void setCustomerdirectory(CustomerDirectory customerdirectory) {
        this.customerdirectory = customerdirectory;
    }
    
    
    @Override
    public String toString() {
        return flightName;
    }
    
    
}
