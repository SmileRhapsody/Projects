/**
 * ����if���
 * @author Administrator
 *
 */
public class Testif {
	public static void main(String[] args) {
		double d = Math.random();	//0-1֮����������������1
		System.out.println(d);  
		
		int i = (int)(6*Math.random()+1);	//1-6���
		System.out.println(i);
		if(i<=3)
			System.out.println("С");
			System.out.println("ССС");	//�����if�޹�
			
			
		System.out.println("####################3");
		//ͨ��Ͷ���������ӿ���������������
		int h = (int)(6*Math.random()+1);
		int j = (int)(6*Math.random()+1);
		int k = (int)(6*Math.random()+1);
		int count = h + j + k;
		if(count > 15){
			System.out.println("������������");
		}
		if(count>=10&&count<=15) {
			System.out.println("����������һ��");
		}
		if(count<10) {
			System.out.println("������������ô��");
		}
	}
}
