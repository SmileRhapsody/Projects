package Containers;

public class Student {
	private Integer id;
	private String fName;
	private String lName;
	private Integer age;
	private Double gpa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", age=" + age + ", gpa=" + gpa + "]";
	}
	
	public Student () {
		
	}
	
	public Student(int id, String fName, String lName, int age, double gpa) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gpa = gpa;
	}
}
