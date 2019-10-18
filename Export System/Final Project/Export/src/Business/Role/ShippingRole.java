/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Department.DataDepartment;
import Business.Department.Department;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.User.User;
import Interface.Shipping.ShippingWorkAreaJPanel;
import javax.swing.JPanel;



/**
 *
 * @author raoyuhuizi
 */
public class ShippingRole extends Role {
    @Override 
    public JPanel createWorkArea(JPanel userProcessContainer,  User user, Department dep, Enterprise enterprise, Network network, EcoSystem business){
        return new ShippingWorkAreaJPanel(userProcessContainer, user, (DataDepartment)dep, enterprise, network);
    }
}
