/**
 * ����if elseif else
 * @author Administrator
 *
 */
public class TestIfElseIfElse {
	public static void main(String[] args) {
		int age = (int)(100*Math.random());
		System.out.println("������"+age+"������");
		if(age<15) {
			System.out.println("��ͯ");
		}else if(age<25) {
			System.out.println("����");
		}else if(age<45) {
			System.out.println("����");
		}else if(age<65) {
			System.out.println("������");
		}else if(age<85) {
			System.out.println("����");
		}else {
			System.out.println("������"); 
		}
		
	}
}
