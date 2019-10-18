package neu.csye6200.patterns;

public class Customer extends Person implements Comparable<Customer>{
	private String customerID;
	private double cost;
	
	public Customer() {}
	
	public Customer(String name, String ID, int age, String customerID, double cost) {
		super(name, ID, age);
		this.customerID = customerID;
		this.cost = cost;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	@Override
	public void show() {
		System.out.println("It's a customer");
	}

	@Override
	public int compareTo(Customer o) {
		return Double.compare(this.getCost(), o.getCost());
	}
	
}
