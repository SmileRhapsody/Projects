
public class TestIdentifer {
	public static void main(String[] args) {
		int a123 = 1;
		//int 123abc = 2;	//数字不能开头
		int $a = 3;
		//int #abc = 5;	//不能含有除字母 下划线 美元符之外的符号  
		int 年龄 = 18;	// 可以使用汉字 但不建议
		//int class = 2;	//关键字不能作为标识符
	}
}

/*
类成员变量、局部变量、方法名：首字母小写和驼峰原则（monthSalary）
常量：大写字母和下划线（MAX_VALUE）
类名：首字母大写和驼峰原则（GoodMan）
*/