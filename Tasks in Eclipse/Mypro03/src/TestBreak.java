/**
 * 测试循环语句中的break
 * @author Administrator
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int total =0;
		System.out.println("Begin");
		while(true) {
			total++;
			int i = (int)Math.round(100*Math.random());
			System.out.println(i);
			if(i==88) {
				break;//终止所有循环
				//continue则指终止本次循环 即不进行接下来的程序直接回到开头
			}
		}
		System.out.println("Game over, used "+ total+" times.");
	}
}
