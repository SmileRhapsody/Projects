
public class TestThis {
	int a,b,c;
	
	TestThis(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	TestThis(int a, int b, int c){
		//TestThis(a,b); ������һ������������ֱ�������ƣ�Ҫ��this
		this(a,b);	//�������ĵ��ñ���ŵ���һ��
		this.c = c;
	}
	
	void sing() {
		
	}
	
	void eat() {
		this.sing();
		System.out.println("123123");
	}
	
	// this��������static������
	public static void main(String[] args) {
		TestThis hi = new TestThis(2,3);
		hi.eat();
	}
}
