/**
 * 带标签的break和continue
 * @author Administrator
 *
 */
public class TestLabelContinue {
	public static void main(String[] args) {
		//打印101-150之间的所有质数
		outer: for(int i = 101;i<150;i++) {
			for (int j =2;j<i/2;j++) {
				if (i%j==0) {
					continue outer;	//直接跳到外部循环
				}
			}
			System.out.print(i+" ");
		}
	}
}
