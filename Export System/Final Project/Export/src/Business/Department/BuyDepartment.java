/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;


import Business.Role.BuyRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author raoyuhuizi
 */
public class BuyDepartment extends Department {
    public BuyDepartment(){
        super(Department.Type.BuyRole.getValue());
    }
    @Override 
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles=new ArrayList();
        roles.add(new BuyRole());
        return roles;
    }
}
