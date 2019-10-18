/**
 * 测试静态初始化块
 * @author Administrator
 *
 */
public class StatIniBlock {
	int id;
	String name;
	String pwd;
	static String company = "UIBE";
	
	static {
		System.out.println("执行类的初始化工作");
		company = "Beijing";
		printCompany();
	}
	

	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		StatIniBlock s = null;
	}
}