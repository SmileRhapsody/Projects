/**
 * 测试Switch语句
 * 多值判断使用switch 但也可以使用if else代替
 * @author Administrator
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		int month = (int)(1+12*Math.random());
		System.out.println("月份："+month);
	
		//JDK1.5之前Switch表达式内必须是整数（除long）或者枚举，不能是字符串
		//JDK1.7之后允许使用字符串
		switch(month) {
		case 1:
			System.out.println("一月份");
			break;	//表示switch结束， 如果没有，case1进行之后会接着进行case2
		case 2:
			System.out.println("二月份");
			break;
		default:
			System.out.println("其他月份");
			break;
		}
		
		System.out.println("#################");
		char c = 'a';
		int rand = (int)(26*Math.random());
		char c2 = (char)(c+rand);
		System.out.println(c2+":");
		switch(c2){
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println("元音");
			break;
		case'y':
		case'w':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
		}
	}
}
