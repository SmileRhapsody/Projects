/**
 * 逻辑运算符
 * @author Administrator
 *
 */
public class TestOperator03 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);//不一样为true 一样为false
		System.out.println(!b2);
		
		//短路
		//boolean b3 = 1>2&2<(3/0); 会报错，因为0不能为除数
		boolean b3 = 1>2 && 2<(3/0);	
		//短路与 第一个操作值为false 则不需要计算后面的值		
	}
}
