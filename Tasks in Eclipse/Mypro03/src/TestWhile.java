/**
 * 测试While循环
 * @author Administrator
 *
 */
public class TestWhile {
	public static void main(String[] args) {
		//计算1+2+3+...+100的和
		int i = 1;
		int sum = 0;
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println(sum);
	}
}
