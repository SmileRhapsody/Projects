/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrator
 */
public class Driver {
    private Product product;
    
    public Driver(){
        product = new Product();
    }

    public void Create() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter prodcut name: ");
        String name = reader.readLine();
        System.out.print("Enter prodcut price: ");
        String price = reader.readLine();
        System.out.print("Enter prodcut available number: ");
        String avaNum = reader.readLine();
        System.out.print("Enter prodcut description: ");
        String description = reader.readLine();
        System.out.print("Enter prodcut supplier name: ");
        String sName = reader.readLine();
        System.out.print("Enter prodcut supplier address: ");
        String sAdd = reader.readLine();
        product.setName(name);
        product.setPrice(Double.parseDouble(price));
        product.setAvailNum(Integer.parseInt(avaNum));
        product.setDescription(description);
        product.getSupplier().setName(sName);
        product.getSupplier().setAddress(sAdd);
        
    }
    
    public void View(){
        System.out.println("Prodcut name is: " + product.getName());
        System.out.println("Prodcut price is: " + product.getPrice());
        System.out.println("Prodcut available number is: " + product.getAvailNum());
        System.out.println("Prodcut description is: " + product.getDescription());
        System.out.println("Prodcut supplier name is: " + product.getSupplier().getName());
        System.out.println("Prodcut supplier address is: " + product.getSupplier().getAddress());
    }
    
    public void Update() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Update prodcut name: " + product.getName() + " to ");
        String name = reader.readLine();
        System.out.print("Enter prodcut price: " + product.getPrice() + " to ");
        String price = reader.readLine();
        System.out.print("Enter prodcut available number: " + product.getAvailNum() + " to ");
        String avaNum = reader.readLine();
        System.out.print("Enter prodcut description: " + product.getDescription() + " to ");
        String description = reader.readLine();
        System.out.print("Enter prodcut supplier name: " + product.getSupplier().getName() + " to ");
        String sName = reader.readLine();
        System.out.print("Enter prodcut supplier address: " + product.getSupplier().getAddress() + " to ");
        String sAdd = reader.readLine();
        product.setName(name);
        product.setPrice(Double.parseDouble(price));
        product.setAvailNum(Integer.parseInt(avaNum));
        product.setDescription(description);
        product.getSupplier().setName(sName);
        product.getSupplier().setAddress(sAdd);
    }
    
    public static void main(String args[]) throws IOException {
        Driver driver = new Driver();        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 to create");
        System.out.println("Enter 2 to view");
        System.out.println("Enter 3 to update");
        System.out.println("Enter any other number to end");
        int number = 1;
        while(number == 1|number == 2|number ==3){
            System.out.print("Enter comment number: ");
            number = Integer.parseInt(reader.readLine());
            switch(number){
                case 1:
                    driver.Create();
                    break;
                case 2:
                    driver.View();
                    break;
                case 3:
                    driver.Update();
                    break;
                }
        }
    }
    
}
