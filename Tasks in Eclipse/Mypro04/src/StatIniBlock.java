/**
 * ���Ծ�̬��ʼ����
 * @author Administrator
 *
 */
public class StatIniBlock {
	int id;
	String name;
	String pwd;
	static String company = "UIBE";
	
	static {
		System.out.println("ִ����ĳ�ʼ������");
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