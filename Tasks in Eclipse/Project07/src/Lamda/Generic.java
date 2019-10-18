package Lamda;

import java.util.ArrayList;
import java.util.List;

public class Generic {
	//String Collection Show method
	
	void showList(String title, List<String> l) {
	System.out.println(l.size() + title);
		for (String n : l) {
			System.out.print(n +",");
		}
		System.out.println();
	}

	//Generic Collection Show method
		
	<E>void showList1(String title, List<E> l) {
		System.out.println(l.size() + title);
		int i = 1;
		for (E n : l) {
			System.out.print(i + ". " + n + " ");
			i++;
		}
		System.out.println();
	}
	
	//// Implement the Show Functional interface with a Lambda

	
	@FunctionalInterface
	public interface Show<T> {
		void show(T t);
	}
	
	public void run(){
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("iPhone");
		shoppingList.add("iPad");
		shoppingList.add("macBook");
		
		showList("mobile phone", shoppingList);
		
		// Implement the Show Functional interface with a Lambda
		Show<String> showPrice = o -> System.out.println(o);

		for (String item : shoppingList) {
			showPrice.show(item);
		}
	}
	
}
