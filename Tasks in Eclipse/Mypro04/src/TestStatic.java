//static修饰的成员变量和方法，从属于类
//普通变量的方法从属于对象的
//静态变量和静态方法会分配到方法区（还包含代码和常量）
public class TestStatic {
	int id;
	String name;
	String pwd;
	static String company = "UIBE";
	
	public TestStatic(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void login() {
		//正常方法可以调用静态方法和属性
		System.out.println("登录："+name);
	}
	
	public static void printCompany() {
		//login();	静态方法不能调用非静态成员
		//静态方法中不能用this,因为其不从属于类
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		TestStatic u = new TestStatic(101,"zxg");
		TestStatic.printCompany();
		TestStatic.company = "Beijng";
		TestStatic.printCompany();
	}
}
