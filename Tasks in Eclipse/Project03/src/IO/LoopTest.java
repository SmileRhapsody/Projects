package IO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;

public class LoopTest {
	
	public void runIterator() {
		List<String> str = new Vector<>();
		str.add("b");
		str.add("c");
		List<String> str2 = new Vector<>();
		str2.add("a");
		str2.add("d");
		str2.addAll(1, str);
		
		Iterator<String> iterator = str2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void runListIterator() {
		List<String> str = new Vector<>();
		str.add("b");
		str.add("c");
		List<String> str2 = new Vector<>();
		str2.add("a");
		str2.add("d");
		str2.addAll(1, str);
		
		ListIterator<String> iterator = str2.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			if(iterator.next().equals("b")) {
				iterator.previous();
				System.out.println(iterator.next());
				break;
			}
		}
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
	
	public void runMap() {
		Map<LoopTest , String> m = new HashMap<>();
		LoopTest l1 = new LoopTest();
		m.put(l1 , "1");
		LoopTest l2 = new LoopTest();
		m.put(l2 , "2");
		LoopTest l3 = new LoopTest();
		m.put(l3 , "3");
		System.out.println(m.get(l3));
	}
	
	
	
}
