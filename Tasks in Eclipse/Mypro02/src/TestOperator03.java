/**
 * �߼������
 * @author Administrator
 *
 */
public class TestOperator03 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		System.out.println(b1^b2);//��һ��Ϊtrue һ��Ϊfalse
		System.out.println(!b2);
		
		//��·
		//boolean b3 = 1>2&2<(3/0); �ᱨ����Ϊ0����Ϊ����
		boolean b3 = 1>2 && 2<(3/0);	
		//��·�� ��һ������ֵΪfalse ����Ҫ��������ֵ		
	}
}
