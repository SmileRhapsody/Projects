/**
 * ���Ծ籾��������
 * @author Andy
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//�������ͱ���
		int a = 15;
		int b = 015;	//��0 ��ͷ�ǰ˽���
		int c = 0x15;	//��0x��ͷ��16����
		int d = 0b1101;	//��ob����08��ͷ�Ƕ�����
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		/*
		 byte 	1�ֽ�	-2^7-2^7
		 short 	2�ֽ�	-2^15-2^15
		 int	4�ֽ�	-2^31-2^31
		 long	8�ֽ�	-2^63-2^63
		 */
		
		byte age = 30;
		short salary = 30000;
		int population = 2000000000;	//���γ���Ĭ��Ϊint����
		long globlePopulation = 7400000000L;	//�����L��l��ʾ����һ��long���͵ĳ���
		
	}
}
