/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airline;



/**
 *
 * @author raoyuhuizi
 */
public class Airline {
    private String alName;
//    private int id;
//    private int num;
    private FlightDirectory fltList;
//    private static int count=1;
    public Airline(){
//        id=count;
//        count++;
        fltList=new FlightDirectory();
    }

//    public int getId() {
//        return id;
//    }

    public String getAlName() {
        return alName;
    }

    public void setAlName(String alName) {
        this.alName = alName;
    }

//    public int getNum() {
//        return num;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }

    public FlightDirectory getFltList() {
        return fltList;
    }

    public void setFltList(FlightDirectory fltList) {
        this.fltList = fltList;
    }
    
      @Override
    public String toString() {
        return this.alName;
    }

//    public static int getCount() {
//        return count;
//    }
//
//    public static void setCount(int count) {
//        Airline.count = count;
//    }
    
    
}
