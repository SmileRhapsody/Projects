//static���εĳ�Ա�����ͷ�������������
//��ͨ�����ķ��������ڶ����
//��̬�����;�̬��������䵽������������������ͳ�����
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
		//�����������Ե��þ�̬����������
		System.out.println("��¼��"+name);
	}
	
	public static void printCompany() {
		//login();	��̬�������ܵ��÷Ǿ�̬��Ա
		//��̬�����в�����this,��Ϊ�䲻��������
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		TestStatic u = new TestStatic(101,"zxg");
		TestStatic.printCompany();
		TestStatic.company = "Beijng";
		TestStatic.printCompany();
	}
}
