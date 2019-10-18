package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVTest2 {
	public void run() {
		List<Student> students = new ArrayList<Student>();
		   try {
			Scanner inLine = new Scanner(new BufferedReader(new FileReader("Demo.csv")));
			while (inLine.hasNextLine()) {
				String inputLine = inLine.nextLine();
				Scanner in = new Scanner(inputLine);
				in.useDelimiter(",");
				String lname = in.next();
				String fname = in.next();
				int age = in.nextInt();
				double gpa = in.nextDouble();
								
				students.add(new Student (fname,lname,age,gpa));
				in.close();
			}
			for(Student st: students) {
				System.out.println(st.getFname() + " " + st.getLname() + " " + st.getAge()+" "+st.getGpa());
			}
			inLine.close();
		   } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }

	}
}
