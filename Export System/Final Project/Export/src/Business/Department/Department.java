/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Department;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.User.UserDirectory;
import java.util.ArrayList;



/**
 *
 * @author raoyuhuizi
 */
public abstract class Department {
    private String name;
    private EmployeeDirectory empList;
    private UserDirectory userList;
    private int departmentID;
    private static int count=-1;
    private Type type;
    
    public enum Type{
        Admin("Admin Department"),
        DataRole("DataRole"),
        BuyRole("BuyRole"),
        SellRole("SellRole");
        private String value;
        private Type(String value){
            this.value=value;
        }
        public String getValue(){
            return value;
        }
    }
     public Department(String name){
         this.name=name;
         empList=new EmployeeDirectory();
         userList=new UserDirectory();
         departmentID=count;
         ++count;
     }
     public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public EmployeeDirectory getEmpList() {
        return empList;
    }

    public UserDirectory getUserList() {
        return userList;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    
    
    @Override
    public String toString(){
        return name;
    }
}
   
