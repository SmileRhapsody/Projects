
public class SxtStu {
	//���ԣ�field ��Ա������
	int id;
	String name;
	int age;
	
	Computer comp;//�����
	
	//�����������Ϊ�����͹���ʵ�֣�
	void  study() {
		System.out.println("������"+comp.brand+"����ѧϰ");
	}
	
	void play() {
		System.out.println("��������Ϸ");
	}
	
	//���췽�������ڴ��������Ķ����޲εĹ��췽��������ϵͳ�Զ�����
	SxtStu(){
		
	}
	
	//����ִ�е���ڣ�����Ҫ��
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();	//����һ������
		System.out.println(stu);	//����ĵ�ַ�����˵�ַ����ջ֡�ڵķ���
		stu.id = 1001;
		stu.name = "zxg";
		stu.age = 18;
		
		Computer c1 = new Computer();
		c1.brand = "����";
		
		stu.comp = c1;
		
		stu.play();
		stu.study();
		
	}
}

//�����ж���� ��ֻ����һ����public���ε���
class Computer {
	String brand;
}



