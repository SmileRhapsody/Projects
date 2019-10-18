package Lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Stream implements Comparator<Integer>{
	
	public void simpleStream() {
		List<Integer> l = Arrays.asList(5,2,4,1,3);
		l.forEach(n -> System.out.print(n + " "));
		System.out.println("reduce to sorted odd subset");
		l.stream()
		.filter(Stream::greaterThanTwo)
		.filter(n -> n % 2 == 1)	// odd ONLY
		.sorted()	// ascending
		.sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		})
		.sorted(Stream::compareInt)	//descending
		.map(n -> 100*n) 		// scale by 10
		.forEach(n -> System.out.print(n + ", "));	// output
		System.out.println();
	}
	
	public  void simplePredicate () {
		List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Predicate<Integer> over5Predicate = n -> { return n > 5; }; 
		for (Integer n : ints) {
			if (over5Predicate.test(n)) {
				System.out.print(n + " <** ");
			} else {
				System.out.print(n + " ");
			}
		}
	}
	
	public void predicate() {
		List<String> states = Arrays.asList("ma","ny","ct","vt","ri","nh","nv","nc","nd","wa","wv",
				"ut","ca","az","al","ak","ok","pa","me","ms","il","id","mn","wy","mt","wi","ia","ar",
				"hi","sd","sc","md","nj","de","ga","fl","mi","oh","in","or","ky","tn","va","mo","ks",
				"co","la","tx","nm","ne");
		Predicate<String> uStates= s -> {return s.startsWith("u");};
		states.stream()
		.filter(s -> s.startsWith("u"))
		//or use predicate
		.filter(uStates)
		.map(String::toUpperCase)
		.sorted()
		.forEach(s -> System.out.print(s + ", "));
		
	}
	
	public void discount() {
		final List<Double> prices =Arrays.asList(5.0,10.0,15.0,20.0);
		final Double totalOfDiscountedPrices = 	
			prices.stream()
			.mapToDouble((Double price) -> price * 0.9)
			.sum();

		System.out.println("Total: $" + totalOfDiscountedPrices);

	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static int compareInt(Integer o1, Integer o2) {
		return o2-o1;
	}
	
	public static boolean greaterThanTwo(Integer n) {
		return n > 2; 
	}

}
