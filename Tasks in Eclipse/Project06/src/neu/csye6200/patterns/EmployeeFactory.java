package neu.csye6200.patterns;

import neu.csye6200.API.AbstractPersonAPI;
import neu.csye6200.factory.AbstractPersonFactory;

public class EmployeeFactory extends AbstractPersonFactory{
	
	@Override
	public AbstractPersonAPI getPerson() {
		return new Employee();
	}
	
	public Employee getPerson(String name, String ID, int age, String employeeID, double wage) {
		return new Employee(name, ID, age, employeeID, wage);
	}
	
}