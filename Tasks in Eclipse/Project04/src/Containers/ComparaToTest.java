package Containers;

import java.util.Arrays;
import java.util.Comparator;

public class ComparaToTest implements Comparator<String>{
	
	private String[] name = {"a","c","b"}; 

	public void demo() {
		Arrays.sort(name, new ComparaToTest());
		for(String s: name) {
			System.out.println(s);
		}
	}
	
	@Override
	public int compare(String o1, String o2) {
		System.out.println(o1.compareTo(o2));
		return o1.compareTo(o2);
	}
	
}
