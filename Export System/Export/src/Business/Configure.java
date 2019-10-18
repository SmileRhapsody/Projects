/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SysAdmRole;

/**
 *
 * @author raoyuhuizi
 */
public class Configure {
    public static EcoSystem configure(){
        EcoSystem system= EcoSystem.getInstance();
        Employee employee=system.getEmpList().createEmployee("rzz");
        system.getUserList().createUser("rzz", "rzz", employee, new SysAdmRole());
        system.getUserDS().getUserDirectory().createUser("rzz", "rzz", employee, new SysAdmRole());
        return system;
    }
}
