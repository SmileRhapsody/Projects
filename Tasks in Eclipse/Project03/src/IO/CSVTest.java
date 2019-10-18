package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVTest {
	public void run() {
		List<Student> students = new ArrayList<Student>();
		try (BufferedReader inLine = new BufferedReader(new FileReader("Demo.csv"));
		) {
			String inputLine = null;	// read one line from file at a time
			while ((inputLine = inLine.readLine()) != null) {
				String[] fields = inputLine.split(",");
				String lname = fields[0];
				String fname = fields[1];
				int age = new Integer(fields[2]);
				double gpa = new Double(fields[3]);
				
				students.add(new Student (fname,lname,age,gpa));
			}
			for(Student st: students) {
				System.out.println(st.getFname() + " " + st.getLname() + " " + st.getAge()+" "+st.getGpa());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
