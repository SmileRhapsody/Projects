package IO;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BWrite {
	public void write() {
		String[] number = {"Xiaoge","Zhang","23","4.0"};
		try(
			FileWriter fw = new FileWriter("Demo.csv");
			BufferedWriter bw = new BufferedWriter(fw);){
			bw.write(number[0] + "," + number[1] + "," + number[2]+","+number[3]);
			bw.newLine();
			bw.write(number[1] + "," + number[0] + "," + number[2]+","+number[3]);
			/*for (String num : number) {
				bw.write(num);
				bw.newLine();
			}*/
			bw.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
