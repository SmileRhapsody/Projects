/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author raoyuhuizi
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public boolean checkEntName(String name){
        
        for(Enterprise enterprise:enterpriseList){
           if(enterprise.getName().equals(name)){
            return false;
        } 
        }
        return true;
    }
    public void deleteEnterprise(Enterprise en){
        
        enterpriseList.remove(en);
        
    }
    public Enterprise createEnterprise(String name,Enterprise.EnterpriseType type, String networkName){
        Enterprise ent=null;
        if(type==Enterprise.EnterpriseType.Export){
            ent=new ExportEnterprise(name);
            ent.setNetworkName(networkName);
            enterpriseList.add(ent);
            
        }
        if(type==Enterprise.EnterpriseType.Manufacturing){
            ent=new ManufacturingEnterprise(name);
            ent.setNetworkName(networkName);
            enterpriseList.add(ent);
            
        }
        if(type==Enterprise.EnterpriseType.Transport){
            ent=new TransportEnterprise(name);
            ent.setNetworkName(networkName);
            enterpriseList.add(ent);
            
        }
        return ent;
    }
}
