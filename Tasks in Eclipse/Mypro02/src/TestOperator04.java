/**
 * 位运算符
 * @author Administrator
 *
 */
public class TestOperator04 {
	public static void main(String[] args) {//位运算 二进制
		int a = 3;	//0011 
		int b = 4;	//0100
		System.out.println(a&b);	//0000
		System.out.println(a|b);	//0111
		System.out.println(a^b);	//0111
		System.out.println(~a);		//取反 1100
		
		//移位
		int c = 3<<2;	//相当于3*2*2 0011--1100
		System.out.println(12>>1);	//相当于12/2 1100--110
	}
}
