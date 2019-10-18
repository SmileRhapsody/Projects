package IO;

public class Student {
	private String Lname;
	private String Fname;
	private int Age;
	private Double Gpa;
	
	public Student() {
		
	}
	
	public Student(String fname,String lname,int age, Double gpa) {
		this.Fname = fname;
		this.Lname = lname;
		this.Age = age;
		this.Gpa = gpa;
	}
	
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Double getGpa() {
		return Gpa;
	}
	public void setGpa(Double gpa) {
		Gpa = gpa;
	}

}
