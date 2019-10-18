/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jhalak
 */
public class AirlinerDirectory {
     private ArrayList<Airliner> airlinersDirectory;

    public AirlinerDirectory() {
        this.airlinersDirectory = new ArrayList<Airliner> ();
    }
     
     
 
     
     
    public ArrayList<Airliner> getAirlinersDirectory() {
        return airlinersDirectory;
    }

    public void setAirlinersDirectory(ArrayList<Airliner> airlinersDirectory) {
        this.airlinersDirectory = airlinersDirectory;
    }
    
    
    
     public void addToAirlinerList(List<Airliner> airlinerList) {
        try {

            SimpleDateFormat parser = new SimpleDateFormat("MM-dd-yyyy hh:mm");
            BufferedReader br = new BufferedReader(new FileReader("D:\\AED\\HomeworkAssignment_4\\AirlinerDetails.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] airPlane = line.split(",");
                if (airPlane.length > 0) {
                    Airliner airPlaneObj = new Airliner(airPlane[0],airPlane[1], 
                            airPlane[2],airPlane[3]);

                    airlinerList.add(airPlaneObj);
                }

            }
        } catch (FileNotFoundException exception) {
            JOptionPane.showMessageDialog(null, "The file has not been found");
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(null, "The was an error while reading the file");
        } 
    }

     
     public Airliner addAirliner() {
        Airliner airliner = new Airliner();
        airlinersDirectory.add(airliner);
        return airliner ;
    }
     
     
     
     
     
     
     
     
     
}
