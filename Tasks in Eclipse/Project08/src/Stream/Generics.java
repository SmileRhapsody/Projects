package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
	
//	Wildard: List<? extends Number>
	public static double sumOfList(List<? extends Number> list) { 
		double sum = 0.0; 
		for (Number n : list)
			sum += n.doubleValue();
		  	return sum;
	}
	
	public void run() {
		List<Integer> ints = Arrays.asList(1, 2, 3);
		System.out.println("sum = "+ sumOfList(ints));
		
		List<Double> d = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(d));
		
		List<Integer> a = new ArrayList<>();
		addNumbers(a);
		a.forEach(System.out::println);
		
		ShowState<String> s = new ShowState<>();
		s.addOBject("123");
		s.addOBject("234");
		s.showObjects("title");
	}
	
//	Unbounded Type: List<?>
//	1. If you are writing a method that can be implemented using functionality provided in the Object class.
//	2. When the code is using methods in the generic class that don't depend on the type parameter.
//	like List.size or List.clear.

//	List<Object> Can insert Object; Can insert ANY subtype of Object
//	List<?> Can ONLY insert null
	public static void printList(List<?> list) { 
	      for (Object elem: list) 
	          System.out.print(elem + " ");
	      System.out.println(); 
	  } 
	
//	Lower bounded Type: <? super Foo>
	  public void addNumbers(List<? super Integer> list) { 
	      for (int i = 1; i <= 10; i++) { 
	          list.add(i); 
	      }
	  }
	  
	  public class ShowState<E> {
		  private List<E> objects = new ArrayList<E>();
		  	public void addOBject(E obj) {
		  		this.objects.add(obj);
		  	}
		  	public void showObjects(String title) {
		  		System.out.println(title);
		  		this.objects.stream()
		  		.forEach(System.out::println);
		  		System.out.println(objects.size() + " objects.");
		  	}
	  }


}
