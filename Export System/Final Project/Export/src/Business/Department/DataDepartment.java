/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;


import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.ShippingRole;



/**
 *
 * @author raoyuhuizi
 */
public class DataDepartment extends Department {
    public DataDepartment(){
        super(Department.Type.DataRole.getValue());
        
    }
    @Override
    public ArrayList <Role> getSupportedRole(){
        ArrayList<Role> roles=new ArrayList();
        roles.add(new ShippingRole());
        return roles;
    }
}
