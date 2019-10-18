/**
 * 测试方法的基本使用
 * @author Administrator
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.pinrtSxt();
		int c = tm.add(30,40,50)+1000;
		System.out.println(c);
	}
	
	void pinrtSxt() {	//无返回值时必须用void
		System.out.println("北京");
		System.out.println("上海");
		System.out.println("广州");
	}
	
	int add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
		return sum;	//两个作用：1 结束方法的运行 2 返回值
		}
	
}
