/**
 * ����ѭ������е�break
 * @author Administrator
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int total =0;
		System.out.println("Begin");
		while(true) {
			total++;
			int i = (int)Math.round(100*Math.random());
			System.out.println(i);
			if(i==88) {
				break;//��ֹ����ѭ��
				//continue��ָ��ֹ����ѭ�� �������н������ĳ���ֱ�ӻص���ͷ
			}
		}
		System.out.println("Game over, used "+ total+" times.");
	}
}
