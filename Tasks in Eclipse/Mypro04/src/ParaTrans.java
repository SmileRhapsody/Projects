/**
 * ���Բ�����ֵ����
 * @author Administrator
 *
 */
public class ParaTrans {
	int id;
	String name;
	String pwd;
	
	public ParaTrans(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void testParameterTransfer01(ParaTrans u) {
		u.name = "zxg";
	}
	
	public void testParameterTransfer02(ParaTrans u) {
		u = new ParaTrans(200,"Xiaoge");
	}
	
	public static void main(String[] args) {
		ParaTrans u1 = new ParaTrans(100, "Andy");
		
		u1.testParameterTransfer01(u1);
		//�൱�ڽ�u1�ĵ�ַ������һ�ݸ������u
		//ԭ�����͸�����ָ��ͬһ����ַ���ı丱����ֵԭ����Ҳ��仯
		
		u1.testParameterTransfer02(u1);
		//����Ӱ��u1�Ĳ��� ��Ϊ������uһ���µĵ�ַ ��u1�޹�
		
		System.out.println(u1.name);
	}
}