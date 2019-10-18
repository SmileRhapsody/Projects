public class TestVariable {
	
	static int size;//静态变量
	
	public static void main(String[] args) {
		int age;
		age = 18;
		int salary= 3000;
		//int gao;
		int gao = 13;
		System.out.println(gao);//变量需要申明  且初始化之后才嗯那个使用
		
		int a;//成员变量，自动初始化
	
	}
}

/*
 变量分类（根据作用域划分）
 局部变量：方法或语句块内部定义的变量（在{}内部）。先声明、赋初值后使用
 成员变量：类的内部定义的变量，从属于对象，伴随对象始终。 如果不初始化，它会自动初始化为该类型的默认初始值
 		int 0;	double 0.0;	char '\u0000';	boolean false;
 静态变量（类变量）： 使用static定义。从属于类，伴随类始终，从类加载到卸载。
 */
