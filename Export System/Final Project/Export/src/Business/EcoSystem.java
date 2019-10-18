/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Department.Department;
import java.util.ArrayList;
import Business.Network.Network;
import Business.Role.Role;
import Business.Role.SysAdmRole;


/**
 *
 * @author raoyuhuizi
 */
public class EcoSystem extends Department{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private UserDataStore userDS;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
//    public static UserDataStore userStoreConfig(){
//        UserDataStore userDataStore=UserDataStore.getInstance();
//        return userDataStore;
//    }
    public Network createNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
     public void deleteNetwork(Network n){
        
        networkList.remove(n);
        
    }
    
    @Override 
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roleList =new ArrayList<Role>();
        roleList.add(new SysAdmRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        userDS=new UserDataStore();
       // userStoreConfig();
        
    }

    public UserDataStore getUserDS() {
        return userDS;
    }

    public void setUserDS(UserDataStore userDS) {
        this.userDS = userDS;
    } 

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    public boolean checkUser(String userName){
        for(Network network:networkList){
           if(!this.getUserList().checkUsername(userName)){
            return false;
        } 
        }
        return true;
    }
    
    public boolean checkNetName(String name){
        
        for(Network network:networkList){
           if(network.getName().equals(name)){
            return false;
        } 
        }
        return true;
    }
}
