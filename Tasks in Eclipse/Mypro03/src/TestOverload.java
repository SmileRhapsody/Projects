/**
 * ���Է�������
 * @author Administrator
 *
 */
public class TestOverload {
	public static void main(String[] args) {
		System.out.println(add(3,5));
		System.out.println(add(3,5,10));
		System.out.println(add(3.0,5));
		System.out.println(add(3,5.0));
	}
	
	public static int add(int n1, int n2) {	//����static�Ͳ�����main�ﴴ��new������
		int sum = n1 + n2;
		return sum;
	}
	//��������ͬ������������ͬ����������
	public static int add(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		return sum;
	}
	//��������ͬ���������Ͳ�ͬ����������
	public static double add(double n1, int n2) {
		double sum = n1 + n2;
		return sum;
	}
	//��������ͬ������˳��ͬ����������
	public static double add(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	/*
	//�������ֻ�з���ֵ��ͬ�������ɷ���������
	public static double add(int n1,int n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	//�������ֻ�в������Ʋ�ͬ�������ɷ���������
	public static int add(int n2,int n1) {
		int sum = n1 + n2;
		return sum;
	}
	*/
}
