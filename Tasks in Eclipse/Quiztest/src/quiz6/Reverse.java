package quiz6;

public class Reverse {
	public void run() {
		String s = "abc";
		char[] cs = s.toCharArray();
		String s1 = "";
		for(int i = 0; i < s.length(); i++) {
			s1 = s1 + s.charAt(s.length()-1-i);
			s1 = s1 + cs[s.length()-1-i];
		}
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb2 = sb.reverse();
		
		System.out.println(s1);
	}
}