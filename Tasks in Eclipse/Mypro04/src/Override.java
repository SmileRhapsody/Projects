//重载方式与方法的重载方式一样
public class Override {
	int id;
	String name;
	String pwd;
	
	public Override() {
		
	}
	
	public Override(int id, String name) {
		this.id = id;	//this表示创建好的对象
		this.name = name;	//直接写name是局部变量的name，离得近
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

