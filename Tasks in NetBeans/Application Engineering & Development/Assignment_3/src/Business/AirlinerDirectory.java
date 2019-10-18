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
public class AirlinerDirectory {
    private ArrayList<Airliner> airlinerList;
    private String Null = "Please select an item";

    public String getNull() {
        return Null;
    }

    public void setNull(String Null) {
        this.Null = Null;
    }
    
    
    public AirlinerDirectory(){
        airlinerList = new ArrayList<>();
    }

    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }

    public Airliner add(){
        Airliner airliner = new Airliner();
        airlinerList.add(airliner);
        return airliner;
    }
    
    public Airliner search(String airLinerName){
        for (Airliner airliner: airlinerList){
            if(airLinerName.equals(airliner.getAirlinerName())){
                return airliner;
            }
        }
        return null;
    }
    
    public void remove(Airliner airliner) {
        airlinerList.remove(airliner);
    }
}
