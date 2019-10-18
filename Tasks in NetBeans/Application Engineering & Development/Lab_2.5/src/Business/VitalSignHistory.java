/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Administrator
 */
public class VitalSignHistory {
    private List<VitalSigns> vitalSignHistory;
    
    public VitalSignHistory(){
        vitalSignHistory = new ArrayList<>();
    }
    
    public List<VitalSigns> getVitalSignHistory(double maxbp, double minbp) {
        List<VitalSigns> abnList = new ArrayList<VitalSigns>();
        for (VitalSigns vs: vitalSignHistory){
            if(vs.getBloodPressure() > maxbp || vs.getBloodPressure() < minbp){
                abnList.add(vs);
            }
        }
        return abnList;
    }
    
    public List<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSigns addVitals(){
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v){
        vitalSignHistory.remove(v);
    }
    
}
