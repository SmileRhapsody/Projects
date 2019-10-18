/**
 * 测试if语句
 * @author Administrator
 *
 */
public class Testif {
	public static void main(String[] args) {
		double d = Math.random();	//0-1之间的随机数，不包含1
		System.out.println(d);  
		
		int i = (int)(6*Math.random()+1);	//1-6随机
		System.out.println(i);
		if(i<=3)
			System.out.println("小");
			System.out.println("小小小");	//这个与if无关
			
			
		System.out.println("####################3");
		//通过投掷三个骰子看看今天的手气如何
		int h = (int)(6*Math.random()+1);
		int j = (int)(6*Math.random()+1);
		int k = (int)(6*Math.random()+1);
		int count = h + j + k;
		if(count > 15){
			System.out.println("今天手气不错");
		}
		if(count>=10&&count<=15) {
			System.out.println("今天手气很一般");
		}
		if(count<10) {
			System.out.println("今天手气不怎么样");
		}
	}
}
