
public class SxtStu {
	//属性（field 成员变量）
	int id;
	String name;
	int age;
	
	Computer comp;//计算机
	
	//方法（类的行为特征和功能实现）
	void  study() {
		System.out.println("我在用"+comp.brand+"电脑学习");
	}
	
	void play() {
		System.out.println("我在玩游戏");
	}
	
	//构造方法，用于创建这个类的对象。无参的构造方法可以由系统自动创建
	SxtStu(){
		
	}
	
	//程序执行的入口，必须要有
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();	//创建一个对象
		System.out.println(stu);	//对象的地址，将此地址赋予栈帧内的方法
		stu.id = 1001;
		stu.name = "zxg";
		stu.age = 18;
		
		Computer c1 = new Computer();
		c1.brand = "联想";
		
		stu.comp = c1;
		
		stu.play();
		stu.study();
		
	}
}

//可以有多个类 但只能有一个用public修饰的类
class Computer {
	String brand;
}



