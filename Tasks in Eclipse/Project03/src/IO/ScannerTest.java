package IO;

import java.util.Scanner;

public class ScannerTest {
	public void write() {
		Student students = new Student();
		Scanner in = new Scanner("Andy, Zhang, 23, 4.0");
		in.useDelimiter(", ");
		students.setFname(in.next());
		students.setLname(in.next());
		students.setAge(in.nextInt());
		students.setGpa(in.nextDouble());
		in.close();
		System.out.println(students.getFname() + " " + students.getLname());
	}
}
