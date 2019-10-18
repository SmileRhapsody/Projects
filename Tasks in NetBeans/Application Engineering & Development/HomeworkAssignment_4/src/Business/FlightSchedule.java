/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jhalak
 */
public class FlightSchedule {

    private String scheduleId;
    private String flightId;
    private Date flightDate;
    private String source;
    private String destination;
    private String airlinerId;
    private String timeOfDay;
    private int price;
    private String airlinerName;
    private ArrayList<Seat> seat=new ArrayList<>();

    public FlightSchedule() {

    }

    public FlightSchedule(String scheduleId, String flightId, String airLinerId, String source,
            String destination, Date flightDate, String timeOfDay, int price, String airlinerName) {

        this.scheduleId = scheduleId;
        this.flightId = flightId;
        this.flightDate = flightDate;
        this.source = source;
        this.destination = destination;
        this.airlinerId = airLinerId;
        this.timeOfDay = timeOfDay;
        this.price = price;
        this.airlinerName = airlinerName;

    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public Date getFlightDate() {
         return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAirlinerId() {
        return airlinerId;
    }

    public void setAirlinerId(String airlinerId) {
        this.airlinerId = airlinerId;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public ArrayList<Seat> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<Seat> seat) {
        this.seat = seat;
    }

    public Seat addSeat() {
        Seat seat = new Seat();
        this.seat.add(seat);
        return seat;
    }

    @Override
    public String toString() {
        return flightId;
    }

}
