package neu.csye6200.patterns;

import neu.csye6200.API.AbstractPersonAPI;
import neu.csye6200.factory.AbstractPersonFactory;

public class CustomerFactory extends AbstractPersonFactory{

	@Override
	public AbstractPersonAPI getPerson() {
		return new Customer();
	}
	
	public AbstractPersonAPI getperson(String name, String ID, int age, String customerID, double cost) {
		return new Customer(name, ID, age, customerID, cost);
	}
	
}
