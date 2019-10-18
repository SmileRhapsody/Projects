/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;
/**
 *
 * @author Administrator
 */
public class Driver {
    
    public static void main(String args[]) {
        Person person = new Person();
        person.setFirstName("123");
        person.setLastName("234");
        person.setDOB("345");
        person.setSocialSecNum("456");
        person.setStreetAdd("567");
        
        Address address = new Address();
        address.setAddLine1("123");
        address.setAddLine2("123");
        address.setCity("123");
        address.setState("123");
        address.setZipCode("123");
        address.setCountry("123");
        person.setHomeaddress(address);
        
        address = new Address();
        address.setAddLine1("234");
        address.setAddLine2("234");
        address.setCity("234");
        address.setState("234");
        address.setZipCode("234");
        address.setCountry("234");
        person.setWorkaddress(address);
        
        address = new Address();
        address.setAddLine1("345");
        address.setAddLine2("345");
        address.setCity("345");
        address.setState("345");
        address.setZipCode("345");
        address.setCountry("345");
        person.setLocaladdress(address);
        
        System.out.println("Person");
        System.out.println("1.  First Name:   " + person.getFirstName());
        System.out.println("2.  Last Name:   " + person.getLastName());
        System.out.println("3.  Date of Birthday:   " + person.getDOB());
        System.out.println("4.  Social Security Number:   " + person.getSocialSecNum());
        System.out.println("4.  Street Address:   " + person.getStreetAdd());
        System.out.println("Home Address");
        System.out.println("1.  Address Line 1:   " + person.getHomeaddress().getAddLine1());
        System.out.println("2.  Address Line 2:   " + person.getHomeaddress().getAddLine2());
        System.out.println("3.  CIty:   " + person.getHomeaddress().getCity());
        System.out.println("4.  State:   " + person.getHomeaddress().getState());
        System.out.println("4.  Zip Code:   " + person.getHomeaddress().getZipCode());
        System.out.println("Work Address");
        System.out.println("1.  Address Line 1:   " + person.getWorkaddress().getAddLine1());
        System.out.println("2.  Address Line 2:   " + person.getWorkaddress().getAddLine2());
        System.out.println("3.  CIty:   " + person.getWorkaddress().getCity());
        System.out.println("4.  State:   " + person.getWorkaddress().getState());
        System.out.println("4.  Zip Code:   " + person.getWorkaddress().getZipCode());
        System.out.println("Local Address");
        System.out.println("1.  Address Line 1:   " + person.getLocaladdress().getAddLine1());
        System.out.println("2.  Address Line 2:   " + person.getLocaladdress().getAddLine2());
        System.out.println("3.  CIty:   " + person.getLocaladdress().getCity());
        System.out.println("4.  State:   " + person.getLocaladdress().getState());
        System.out.println("4.  Zip Code:   " + person.getLocaladdress().getZipCode());
    }    
}
