/**
 * ����Switch���
 * ��ֵ�ж�ʹ��switch ��Ҳ����ʹ��if else����
 * @author Administrator
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		int month = (int)(1+12*Math.random());
		System.out.println("�·ݣ�"+month);
	
		//JDK1.5֮ǰSwitch���ʽ�ڱ�������������long������ö�٣��������ַ���
		//JDK1.7֮������ʹ���ַ���
		switch(month) {
		case 1:
			System.out.println("һ�·�");
			break;	//��ʾswitch������ ���û�У�case1����֮�����Ž���case2
		case 2:
			System.out.println("���·�");
			break;
		default:
			System.out.println("�����·�");
			break;
		}
		
		System.out.println("#################");
		char c = 'a';
		int rand = (int)(26*Math.random());
		char c2 = (char)(c+rand);
		System.out.println(c2+":");
		switch(c2){
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println("Ԫ��");
			break;
		case'y':
		case'w':
			System.out.println("��Ԫ��");
			break;
		default:
			System.out.println("����");
		}
	}
}
