/**
 * λ�����
 * @author Administrator
 *
 */
public class TestOperator04 {
	public static void main(String[] args) {//λ���� ������
		int a = 3;	//0011 
		int b = 4;	//0100
		System.out.println(a&b);	//0000
		System.out.println(a|b);	//0111
		System.out.println(a^b);	//0111
		System.out.println(~a);		//ȡ�� 1100
		
		//��λ
		int c = 3<<2;	//�൱��3*2*2 0011--1100
		System.out.println(12>>1);	//�൱��12/2 1100--110
	}
}
