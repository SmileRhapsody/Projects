/**
 * 测试字符类型
 * boolean类型
 * @author Administrator
 *
 */
public class TestprimitiveDataType3 {
	public static void main(String[] args) {
		char a = 'T';
		char b = '笑';
		char c = '\u0061';//表示字符a
		// 前缀为u表示Unicode 从'\u0000'到'\uFFFF'
		System.out.println(c);
		
		//转义字符
		System.out.println('a'+'b');
		//直接加会转化成数字 需要前面加“”表示字符串
		System.out.println(""+'a'+'\n'+'b');//换行 =\u000a
		/*
		 \b = \u0008	退格backspace
		 \r = \u000d	回车
		 \t = \u0009	制表符tab
		 \" = \u0022	双引号
		 \' = \u0027	单引号
		 \\ = \u005c	反斜杠
		 */
		String d = "abc";//String是字符序列
		
		
		//测试布尔类型
		boolean man = true;
		
		if(man) {	//不能写成（man = true）因为这是赋值
			System.out.println("男性");
		}else {
			System.out.println("女性");
		}
		
	}

}
