/**
 * ��������ת��
 * @author Administrator
 *
 */
public class TestTypeConvert {
	public static void main(String[] args) {
		//byte����short����int
		//char����int
		//int����long/double/--float
		//long--float/double
		//float����double
		int a = 324;
		long b = a;
		double d = b;
		//a = b; int����ת��long
		//long e = 3.23F; float����ת��long
		float f = 234434L;
		
		//����
		byte b2=123;	//int��ʾ��ֵ��byte�����ɷ�Χ��
		
		//ǿ������ת��
		double x = 3.14;	//ֱ��ʡ��С������ ������������
		int nx = (int)x;
		char c = 'a';
		int e = c+1;
		System.out.println(nx);
		System.out.println(e);
		System.out.println((char)e);
	}
}
