/**
 * 测试Do While循环
 * 完全可以用While循环替代
 * @author Administrator
 *
 */
public class TestDoWhile {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i<=100);
		System.out.println("sum="+sum);
	}
}
