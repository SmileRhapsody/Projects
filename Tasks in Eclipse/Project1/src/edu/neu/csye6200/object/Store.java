package edu.neu.csye6200.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.neu.csye6200.api.AbstractItemAPI;
import edu.neu.csye6200.api.AbstractStoreAPI;

public class Store extends AbstractStoreAPI {
	
	private List<AbstractItemAPI> inventory = new ArrayList<>();
	
	public void addItem(AbstractItemAPI p) {
		inventory.add(p);
	}
	
	@Override
	public void show() {
		System.out.println(inventory);
	}

	@Override
	public String getInventoryInfo() {
		String s = "";
		for(AbstractItemAPI p : inventory) {
			s += "[" + p.toString() + "]" + "\n";
		}
		return s;
	}

	@Override
	public void sortInventory() {
		Collections.sort(inventory);
	}

	@Override
	public void clearInventory() {
		inventory = new ArrayList<>();
	}

	@Override
	public void showInventory() {
		System.out.println(this.getInventoryInfo());
	}

}
