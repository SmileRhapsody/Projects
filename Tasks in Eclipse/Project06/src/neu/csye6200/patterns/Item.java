package neu.csye6200.patterns;

import neu.csye6200.API.AbstractItemAPI;

public class Item extends AbstractItemAPI implements Comparable<Item>{
	
	private String name;
	private double price;
	private int available;
	
	public Item() {}
	
	public Item(String name, double price, int available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getAvailable() {
		return available;
	}


	public void setAvailable(int available) {
		this.available = available;
	}

	@Override
	public void show() {
		System.out.println("It's an item");
	}
	
	@Override
	public int compareTo(Item item) {
		return Double.compare(this.getPrice(), item.getPrice());
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", available=" + available + "]";
	}
	
	public int compareByAvailable(Item i1, Item i2) {
		return Integer.compare(i1.getAvailable(), i2.getAvailable());
	}
}
