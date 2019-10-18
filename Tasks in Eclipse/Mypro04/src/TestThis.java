
public class TestThis {
	int a,b,c;
	
	TestThis(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c){
		//TestThis(a,b); 调用另一个构造器不能直接用名称，要用this
		this(a,b);	//构造器的调用必须放到第一句
		this.c = c;
	}
	
	void sing() {
		
	}
	
	void eat() {
		this.sing();
		System.out.println("123123");
	}
	
	// this不能用于static方法中
	public static void main(String[] args) {
		TestThis hi = new TestThis(2,3);
		hi.eat();
	}
}
