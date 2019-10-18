package Containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student1 implements Comparable<Student1> {
	
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
	
	public Student1 () {
		
	}
	
	public Student1(int id, String fName, String lName, int age, double gpa) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.gpa = gpa;
	}
	
	
	public static void demo() {
			List<Student1> students = new ArrayList<>();
			students.add(new Student1(44, "barack", "obama", 56, 3.2));
			students.add(new Student1(45, "donald", "trump", 71, 2.25)); 
			students.add(new Student1(12, "zachary", "taylor", 65, 4.0)); 
			students.add(new Student1(2, "john", "adams", 90, 3.0)); 
			students.add(new Student1(1, "george", "washington", 67, 2.5));
			
			System.out.println(students.size() + " students in the following collection: 1. SORTED BY GPA.");
			Collections.sort(students);// method in slides
			Collections.sort(students, Comparator.comparing(Student1::getGpa));
			students.sort(null); // method in slides
			for (Student1 s : students) {
				System.out.println(s);
			}
			
			System.out.println(students.size() + " students in the following collection: 3. SORTED BY First Name.");
			students.sort(Comparator.comparing(Student1::getfName));
			students.sort(Student1::compareByFirstName);// method in slides
			Collections.sort(students, (x,y)->compareByFirstName(x,y));
			Collections.sort(students, Student1::compareByFirstName);
			students.forEach(student -> {System.out.println(student);});
			
			System.out.println(students.size() + " students in the following collection: 3. SORTED BY LAST NAME.");
			students.sort(Student1::compareByLastName); 
			students.forEach(System.out::println);
			
			System.out.println(students.size() + " students in the following collection: 3. SORTED BY AGE.");
			students.sort((s1,s2)->{return s1.getAge() - s2.getAge(); });
			students.forEach(student -> {System.out.println(student);});
			
			System.out.println(students.size() + " students in the following collection: 3. SORTED BY ID.");
			students.sort(Comparator.comparingInt(Student1::getId));
			students.forEach(s -> {System.out.println(s);});
	}
	
	
	@Override
	public int compareTo(Student1 o) {
		return this.getGpa().compareTo(o.getGpa()); 
	}
	
    public static int compareByLastName(Student1 o1, Student1 o2) {	
    	return o1.getlName().compareTo(o2.getlName());	
    }
    
    public static int compareByFirstName(Student1 o1, Student1 o2) {	
    	return o1.getfName().compareToIgnoreCase(o2.getfName());	
    }
    
    public static int compareByAge(Student1 o1, Student1 o2) { 
    	return Integer.compare(o1.getAge(), o2.getAge());
    	//return o1.getAge().compareTo(o2.getAge());
    }


    /*public static void main(String[] args) {
		demo();
	}*/

}
