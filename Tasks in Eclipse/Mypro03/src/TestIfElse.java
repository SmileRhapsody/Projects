/**
 * ����ifelse˫ѡ��ṹ
 * @author Administrator
 *
 */
public class TestIfElse {
	public static void main(String[] args) {
		double r = 4*Math.random();
		double area = Math.PI*Math.pow(r, 2);
		double circle = 2*Math.PI;
		System.out.println("�뾶Ϊ��"+r);
		System.out.println("���Ϊ��"+area);
		System.out.println("�ܳ�Ϊ��"+circle);
		if(area<=circle) {
			System.out.println("������ڵ����ܳ�");
		}else {
			System.out.println("�ܳ��������");
		}
	}
}