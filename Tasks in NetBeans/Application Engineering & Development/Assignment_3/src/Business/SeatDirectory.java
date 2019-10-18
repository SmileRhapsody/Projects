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
public class SeatDirectory {
    private ArrayList <Seat> seatList;
    
    public SeatDirectory(){
        seatList = new ArrayList<>();
        int row;
        String[] cl = {"Left Window","Left Middle","Left Aisle","Right Window","Right Middle","Right Aisle"};
        for (String str : cl){
            for (row = 1; row < 26 ; row++){
                Seat seat = new Seat();
                seat.setColumn(str);
                seat.setRow(Integer.toString(row));
                seatList.add(seat);
            }
        }
    }

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seat> seatList) {
        this.seatList = seatList;
    }
}
