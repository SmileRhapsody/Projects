//���ط�ʽ�뷽�������ط�ʽһ��
public class Override {
	int id;
	String name;
	String pwd;
	
	public Override() {
		
	}
	
	public Override(int id, String name) {
		this.id = id;	//this��ʾ�����õĶ���
		this.name = name;	//ֱ��дname�Ǿֲ�������name����ý�
	}
	
	public Override(int id, String name, String pwd) {
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public static void main(String[] args) {
		Override o1 = new Override();
		Override o2 = new Override(101,"zxg");
		Override o3 = new Override(101,"zxg","123456");
	}
}

