package edu.neu.csye6200.object;

import edu.neu.csye6200.api.AbstractItemAPI;

public class Bread extends Item {

	private double calories;
	
	public Bread(int id, double price, double calories) {
		super(id, price);
		this.calories = calories;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Bread id = " + this.getId() + ", Price = " + this.getPrice() + ", Calories = " + this.getCalories();
	}

	@Override
	public int compareTo(AbstractItemAPI o) {
		return Integer.compare(((Bread) this).getId(), ((Bread) o).getId());
	}
}
