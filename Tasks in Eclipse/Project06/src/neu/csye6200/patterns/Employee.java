package neu.csye6200.patterns;

public class Employee extends Person implements Comparable<Employee>{
	private String employeeID;
	private double wage;

	public Employee() {}
	
	public Employee(String name, String ID, int age, String employeeID, double wage) {
		super(name, ID, age);
		this.employeeID = employeeID;
		this.wage = wage;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "Employee [" + super.toString()+"employeeID=" + employeeID + ", wage=" + wage + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.getAge(), o.getAge());
	}
	
	public int compareByWage(Employee e1, Employee e2) {
		return Double.compare(e1.getWage(),e2.getWage());
	}
	
	@Override
	public void show() {
		System.out.println("It's an employee");
	}
	

}
