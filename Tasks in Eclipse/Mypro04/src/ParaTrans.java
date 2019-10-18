/**
 * 测试参数传值机制
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
		//相当于将u1的地址复制了一份给上面的u
		//原参数和副本都指向同一个地址，改变副本的值原参数也会变化
		
		u1.testParameterTransfer02(u1);
		//不会影响u1的参数 因为赋予了u一个新的地址 和u1无关
		
		System.out.println(u1.name);
	}
}