/**
 *  ���Եݹ�
 * @author Administrator
 *
 */
public class TestRecursion {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();
		System.out.printf("%d�׳˵Ľ����%s%n",10,factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("�ݹ��ʱ��%s%n",d2-d1);
		
		factorialloop(10);
	}

	//��׳˵ķ���
	static long factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	static long factorialloop(int a) {
		long d3 = System.currentTimeMillis();
		long result =1;
		while (a>1) {
			result *= a*(a-1);
			a -= 2;
		}
		long d4 = System.currentTimeMillis();
		System.out.println("�׳˽����"+result);
		System.out.printf("��ͨѭ��ʱ��%s%n",d4-d3);
		return result;
	}
	
	

	/*
	static int count=0;
	static void a() {
		System.out.println("a");
		count++;
		if(count<10) {
			a();
		}else {
			return;
		}
	}
	 */
}
