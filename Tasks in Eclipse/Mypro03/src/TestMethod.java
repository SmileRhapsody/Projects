/**
 * ���Է����Ļ���ʹ��
 * @author Administrator
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//ͨ�����������ͨ����
		TestMethod tm = new TestMethod();
		tm.pinrtSxt();
		int c = tm.add(30,40,50)+1000;
		System.out.println(c);
	}
	
	void pinrtSxt() {	//�޷���ֵʱ������void
		System.out.println("����");
		System.out.println("�Ϻ�");
		System.out.println("����");
	}
	
	int add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
		return sum;	//�������ã�1 �������������� 2 ����ֵ
		}
	
}
