/**
	�������������
 * @author Administrator
 *
 */
public class TestOperator01 {
	public static void main(String[] args) {
		byte a = 1;
		int b = 2;
		//byte c = a+b;		//����
		//��ʹ������ȫΪshort,byte,���Ҳ��int
		long b2 = 3;
		//int c2 = b2 + b;	//����
		//�������������long������ҲΪlong
		
		float f1 = 3.14F;
		float  d = b + b2;//float�ı�����Χ��int��long��
		//float  d2 = f1 + 6.2;	//����
		//��һ��double����Ϊdouble��ֻ�ж���float�������float
		
		System.out.println(-9%5);//������������߲���ͬ
		
		//�����������Լ�
		int e = 3;
		int f = e++; //�ȸ�ֵ ������
		System.out.println("e="+e+"\nf="+f);
		e = 3;
		f = ++e;	//������ ��ֵ
		System.out.println("e="+e+"\nf="+f);
		
		int g = 3;
		int h = 4;
		g += h;	 //�൱��g=g+h
		System.out.println("g="+g+"\nh="+h);
		g = 3;
		g *= h+3;	//�൱��a=a*(b+3)
		System.out.println("g="+g+"\nh="+h);
	}

}
