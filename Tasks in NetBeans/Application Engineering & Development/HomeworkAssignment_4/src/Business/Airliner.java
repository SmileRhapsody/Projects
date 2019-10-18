/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
/**
 *
 * @author jhalak
 */
public class Airliner {

    private String airLinerId;
    private String airlinerName;
    private String address;
    private String manufacturerName;
 

    public Airliner(String airLinerId, String airlinerName, String manufacturerName,String address) {
        this.airLinerId = airLinerId;
        this.airlinerName = airlinerName;
        this.address = address;
        this.manufacturerName=manufacturerName;
    
    }

    
    public Airliner(){
    }

    public String getAirLinerId() {
        return airLinerId;
    }

    public void setAirLinerId(String airLinerID) {
        this.airLinerId = airLinerID;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

   
    @Override
    public String toString() {
        return airLinerId;
    }

}
