package neu.csye6200.patterns;
import neu.csye6200.API.AbstractPersonAPI;

public class Person extends AbstractPersonAPI{

	private String name;
	private String ID;
	private int age;
	
	public Person() {}
	
	public Person(String name, String ID, int age) {
		this.name = name;
		this.ID = ID;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void show() {
		System.out.println("It's a person");
	}

	@Override
	public String toString() {
		return "name=" + name + ", ID=" + ID + ", age=" + age + ", ";
	}
	
	
}
