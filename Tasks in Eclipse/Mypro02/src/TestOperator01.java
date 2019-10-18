/**
	测试算术运算符
 * @author Administrator
 *
 */
public class TestOperator01 {
	public static void main(String[] args) {
		byte a = 1;
		int b = 2;
		//byte c = a+b;		//报错
		//即使操作符全为short,byte,结果也是int
		long b2 = 3;
		//int c2 = b2 + b;	//报错
		//如果操作数中有long，则结果也为long
		
		float f1 = 3.14F;
		float  d = b + b2;//float的表述范围比int和long大
		//float  d2 = f1 + 6.2;	//报错
		//有一个double则结果为double，只有都是float结果才是float
		
		System.out.println(-9%5);//余数符号与左边操相同
		
		//测试自增和自减
		int e = 3;
		int f = e++; //先赋值 后自增
		System.out.println("e="+e+"\nf="+f);
		e = 3;
		f = ++e;	//先自增 后赋值
		System.out.println("e="+e+"\nf="+f);
		
		int g = 3;
		int h = 4;
		g += h;	 //相当于g=g+h
		System.out.println("g="+g+"\nh="+h);
		g = 3;
		g *= h+3;	//相当于a=a*(b+3)
		System.out.println("g="+g+"\nh="+h);
	}

}
