/**
 * 测试类型转化
 * @author Administrator
 *
 */
public class TestTypeConvert {
	public static void main(String[] args) {
		//byte——short——int
		//char——int
		//int——long/double/--float
		//long--float/double
		//float——double
		int a = 324;
		long b = a;
		double d = b;
		//a = b; int不能转化long
		//long e = 3.23F; float不能转化long
		float f = 234434L;
		
		//特例
		byte b2=123;	//int表示的值在byte的容纳范围内
		
		//强制类型转换
		double x = 3.14;	//直接省略小数部分 不是四舍五入
		int nx = (int)x;
		char c = 'a';
		int e = c+1;
		System.out.println(nx);
		System.out.println(e);
		System.out.println((char)e);
	}
}
