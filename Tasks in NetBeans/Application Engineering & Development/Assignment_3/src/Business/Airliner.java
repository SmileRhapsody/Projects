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
public class Airliner {
    private String airlinerName;
    private String address;
    private int contaceNum;
    private AirplaneDirectory airplaneDirectory;
    
    public Airliner(){
        airplaneDirectory = new AirplaneDirectory();
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

    public int getContaceNum() {
        return contaceNum;
    }

    public void setContaceNum(int contaceNum) {
        this.contaceNum = contaceNum;
    }
    
    public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(AirplaneDirectory airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }

    @Override
    public String toString() {
        return airlinerName;
    }
}
