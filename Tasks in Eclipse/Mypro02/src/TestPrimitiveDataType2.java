/**
 * ���Ը�����
 * @author Administrator
 *
 */
import java.math.*;
public class TestPrimitiveDataType2 {

	public static void main(String[] args) {
		/*
		 float	4�ֽ�	-3.403E38-3.403E38
		 		β����ȷ��7λ��Ч����
		 double	8�ֽ�	-1.798E308-1.798E308
		 		��ȷ����float������
		 */
		float a = 3.14F;//������ֵĬ��Ϊdouble���ͣ�float��ֵ��Ӻ�׺F/f
		double b = 6.28;
		double c = 628E-2;
		
		System.out.println(c);
		
		//�������ǲ���ȷ�� ���ܱȽ�
		float f = 0.1f;
		double d = 1.0/10;
		System.out.println(f==d);
		
		float d1 = 423423423f;
		float d2 = d1+1;
		if(d1==d2) {
			System.out.println("d1==d2");
		}else {
			System.out.println("d1!=d2");
		}
		
		//����ʹ�þ�ȷ�������� ������BigDecimal
		
		BigDecimal bd = BigDecimal.valueOf(1.0);
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		bd = bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);
		System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
		
		BigDecimal bd2 = BigDecimal.valueOf(0.1);
		BigDecimal bd3 = BigDecimal.valueOf(1.0/10.0);
		
		System.out.println(bd2.equals(bd3));		
	}
}
