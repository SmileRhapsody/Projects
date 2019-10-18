package edu.neu.csye6200.object;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.api.AbstractItemAPI;
import edu.neu.csye6200.patterns.BreadFactory;
import edu.neu.csye6200.patterns.ElectronicsFactory;
import edu.neu.csye6200.patterns.LiteBreadFactory;
import edu.neu.csye6200.patterns.WalmartFactory;

public class Walmart extends Store {
	
	private int storeId;
	private String name;

	public Walmart(int storeId, String name) {
		super();
		this.storeId = storeId;
		this.name = name;
	}


	public static void demo() {
//		System.out.println("\n\t" + Walmart.class.getName() + ".demo() starting...");
		{
		List<AbstractItemAPI> electronicsProducts = new ArrayList<>();
		electronicsProducts.add(ElectronicsFactory.getObject(001, 5.0));
		electronicsProducts.add(ElectronicsFactory.getObject(002, 10.5));
		electronicsProducts.add(ElectronicsFactory.getObject(003, 100.0));
		electronicsProducts.add(ElectronicsFactory.getObject(004, 20.5));
		
		Store walmart = WalmartFactory.getObject(001, "Walmart1");
		 
		for (AbstractItemAPI e : electronicsProducts) {
		  	walmart.addItem(e);
		}
		System.out.println("Sort inventory by item Price.");
		walmart.sortInventory();
		walmart.showInventory();
//		System.out.println("\n" + walmart.getClass().getName() + ".demo() done!");
		
		walmart.clearInventory();
		System.out.println();
		
		}
		
		
		
		{
		List<AbstractItemAPI> breadProducts = new ArrayList<>();
		breadProducts.add(BreadFactory.getObject(003, 12.5, 500.25));
		breadProducts.add(BreadFactory.getObject(006, 5.5, 100.05));
		breadProducts.add(BreadFactory.getObject(001, 11.0, 1000.5));
		breadProducts.add(BreadFactory.getObject(005, 6.0, 1300));
		
		Store walmart = WalmartFactory.getObject(002, "Walmart2");
		 
		for (AbstractItemAPI b : breadProducts) {
		  	walmart.addItem(b);
		}
		System.out.println("Sort inventory by Item number.");
		walmart.sortInventory();
		walmart.showInventory();
		
		walmart.clearInventory();
		System.out.println();
		
		
		}
		
		
		
		{
		List<AbstractItemAPI> liteBreadProducts = new ArrayList<>();
		liteBreadProducts.add(LiteBreadFactory.getObject(003, 20.5, 500.25));
		liteBreadProducts.add(LiteBreadFactory.getObject(006, 10.75, 1000.0));
		liteBreadProducts.add(LiteBreadFactory.getObject(001, 5.5, 200.5));
		liteBreadProducts.add(LiteBreadFactory.getObject(005, 24.5, 100.0));
		
		
		Store walmart = WalmartFactory.getObject(003, "Walmart3");
		 
		for (AbstractItemAPI b : liteBreadProducts) {
		  	walmart.addItem(b);
		}
		System.out.println("Sort inventory by Calories.");
		walmart.sortInventory();
		walmart.showInventory();
		
		}
	}
	
}
