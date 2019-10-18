/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package Business.Role;

import Business.Customer.Customer;
import Business.Department.Department;
import Business.Department.SellDepartment;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ExportEnterprise;
import Business.Network.Network;
import Business.User.User;
import Interface.AdminRole.AdminWorkAreaJPanel;
import Interface.Sell.SellWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raoyuhuizi
 */
public class AdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Department dep, Enterprise enterprise, Network network, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, (ExportEnterprise)enterprise, business);
    }
}
