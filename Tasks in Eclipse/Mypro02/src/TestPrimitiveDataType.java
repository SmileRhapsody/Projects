/**
 * 测试剧本数据类型
 * @author Andy
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//测试整型变量
		int a = 15;
		int b = 015;	//以0 开头是八进制
		int c = 0x15;	//以0x开头是16进制
		int d = 0b1101;	//以ob或者08开头是二进制
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		/*
		 byte 	1字节	-2^7-2^7
		 short 	2字节	-2^15-2^15
		 int	4字节	-2^31-2^31
		 long	8字节	-2^63-2^63
		 */
		
		byte age = 30;
		short salary = 30000;
		int population = 2000000000;	//整形常量默认为int类型
		long globlePopulation = 7400000000L;	//后面加L或l表示这是一个long类型的常量
		
	}
}
