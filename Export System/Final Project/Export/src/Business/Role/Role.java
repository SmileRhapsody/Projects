/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Department.Department;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.User.User;
import javax.swing.JPanel;



/**
 *
 * @author raoyuhuizi
 */
public abstract class Role {
    public enum RoleType{
        Admin("Admin"),
        DataRole("DataRole"),
        BuyRole("BuyRole"),
        SellRole("SellRole"),
        Customer("Customer"),
        ManufacturingRole("Manufacturing"),
        TransportRole("TransportRole");
        
        private String value;
        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(
            JPanel userProcessContainer,
            User account, 
            Department dep, 
            Enterprise enterprise,
            Network network,
            EcoSystem business);
    
    @Override
    public String toString(){
        return this.getClass().getName();
    }
    
}
