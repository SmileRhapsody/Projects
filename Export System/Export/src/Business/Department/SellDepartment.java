/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Role.SellRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raoyuhuizi
 */
public class SellDepartment extends Department {
    //Warehouse cantains products buyer already bought.
    //ctyDetailList show all countries details which contains product sell price.
    public SellDepartment(){
        super(Department.Type.SellRole.getValue());
    }
    @Override 
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roles=new ArrayList();
        roles.add(new SellRole());
        return roles;
    }
}
