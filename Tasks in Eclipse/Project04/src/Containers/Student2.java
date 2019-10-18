package Containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student2{
	
	public static Comparator<Student> sortByGpa(){
		return Comparator.comparing(Student::getGpa);
	}
	
	public void demo() {
		List<Student> students = new ArrayList<>();
		students.add(new Student(44, "barack", "obama", 56, 3.2));
		students.add(new Student(45, "donald", "trump", 71, 2.25)); 
		students.add(new Student(12, "zachary", "taylor", 65, 4.0)); 
		students.add(new Student(2, "john", "adams", 90, 3.0)); 
		students.add(new Student(1, "george", "washington", 67, 2.5));
		
		Collections.sort(students, Comparator.comparing(Student::getAge));
		Collections.sort(students, new Comparator<Student>(){
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getAge().compareTo(s2.getAge());
			}
		});
		Comparator com = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
			
		};
		students.sort(com);
		students.forEach(s -> System.out.println(s));
		students.sort(Student2.sortByGpa());
		students.forEach(System.out::println);
	}
}
