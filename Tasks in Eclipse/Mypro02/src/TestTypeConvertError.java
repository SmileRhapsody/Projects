/**
 * ��������ת����������
 * @author Administrator
 *
 */
public class TestTypeConvertError {
	public static void main(String[] args) {
		int money = 1000000000;
		int years = 20;
		//���ص�total�Ǹ��� ������int�ķ�Χ
		int total = money * years;
		System.out.println("total="+total);
		//���ص�total��Ȼ�Ǹ����� Ĭ����int����˽����ת��int����ת��long�����Ѿ����������ݶ�ʧ
		long total1 = money*years;
		System.out.println("total1="+total1);
		//���ص�total2��ȷ ���Ƚ�һ�����ӱ��long����������ʽ����������ȫ����long����
		long total2 = money*((long)years);
		System.out.println("total2="+total2);
		long total3 = 34L*3223*years;	//���߿���ֱ�Ӽ�һ��long���͵�ֵ
		System.out.println("total3="+total3);
		
		
		//��������
		int l = 2;	//�ֲ�����L����1
		long a = 23451l; //�����дL
		System.out.println(l+1);
	}
}