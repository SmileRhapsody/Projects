package IO;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class BRead {
	String thisLine = null;
	public void Read() {
		try(	FileReader fr = new FileReader("Demo.csv");
				BufferedReader in = new BufferedReader(fr);
				){
				Student students = new Student();
				students.setFname(in.readLine());
				students.setLname(in.readLine());
				students.setAge(Integer.parseInt(in.readLine()));
				students.setGpa(Double.parseDouble(in.readLine()));
				in.close();
				System.out.println(students.getFname() + " " + students.getAge() + " " + students.getGpa());
			/*while((thisLine = in.readLine())!=null) {
				System.out.print(thisLine + ", ");
			}*/
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
