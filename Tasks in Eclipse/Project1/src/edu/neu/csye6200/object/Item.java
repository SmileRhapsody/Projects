package edu.neu.csye6200.object;

import edu.neu.csye6200.api.AbstractItemAPI;

public class Item extends AbstractItemAPI { 
	private int id;
	private double price;

	public Item(int id, double price) {
		super();
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	@Override
	public int compareTo(AbstractItemAPI o) {
		return Integer.compare(((Item) this).getId(), ((Item) o).getId());
	}

	
	
}
