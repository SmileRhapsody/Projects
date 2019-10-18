package edu.neu.csye6200.object;

import edu.neu.csye6200.api.AbstractItemAPI;

public class Electronics extends Item {

	public Electronics(int id, double price) {
		super(id, price);
	}


	@Override
	public String toString() {
		return "Electronics id = " + this.getId() + ", Price = " + this.getPrice();
	}

	@Override
	public int compareTo(AbstractItemAPI o) {
		return Double.compare(this.getPrice(), ((Electronics) o).getPrice());
	}
	
	
}
