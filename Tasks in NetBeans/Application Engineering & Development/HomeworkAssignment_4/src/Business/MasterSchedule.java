/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author jhalak
 */
public class MasterSchedule {

    private ArrayList<FlightSchedule> masterFlightSchedulesList;

    public MasterSchedule() {
        this.masterFlightSchedulesList = new ArrayList<FlightSchedule>();
    }

    public ArrayList<FlightSchedule> getMasterFlightSchedules() {
        return masterFlightSchedulesList;
    }

    public void setMasterFlightSchedules(ArrayList<FlightSchedule> masterFlightSchedules) {
        this.masterFlightSchedulesList = masterFlightSchedules;
    }

     public void deleteAccount(FlightSchedule flights) {
          masterFlightSchedulesList.remove(flights);
    }
    public FlightSchedule addFlights() {
        FlightSchedule flights = new FlightSchedule();
        masterFlightSchedulesList.add(flights);
        return flights;
    }

}
