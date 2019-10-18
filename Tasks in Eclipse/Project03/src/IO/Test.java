package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Test {
	public static void run() {
		try{
			Scanner inLine = new Scanner(new BufferedReader(new FileReader("Demo.csv")));
			while(inLine.hasNextLine()) {
				String inputLine = inLine.nextLine();
				Scanner in = new Scanner(inputLine);
				in.useDelimiter(",");
				while(in.hasNext()) {
					System.out.println(in.next());
				}
				in.close();
			}
		}catch(Exception e) {
			
		}
	}
}
