package edu.neu.csye6200.object;

import edu.neu.csye6200.api.AbstractItemAPI;

public class LiteBread extends Bread {
	

	public LiteBread(int id, double price, double calories) {
		super(id, price, calories);
	}
	
	@Override
	public String toString() {
		return "LiteBread id = " + this.getId() + ", Price = " + this.getPrice() + ", Calories = " + this.getCalories();
	}

	@Override
	public int compareTo(AbstractItemAPI o) {
		return Double.compare(((LiteBread) this).getCalories(), ((LiteBread) o).getCalories());
	}
}
