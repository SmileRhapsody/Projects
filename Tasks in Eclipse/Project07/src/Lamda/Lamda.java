package Lamda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda {
	public void run() {
		List<String> names = Arrays.asList("jim", "sue", "dan", "len", "zac");
		System.out.println("You found dan! ") ;
				names.stream()
				.filter(n -> n == "dan")
				.forEach(System.out::print);
		
	}
	
	public void run1() {
		Integer[] a = {0,1,2,3,4,5,6,7,8,9};
		List<Integer> mutableNumbers = new ArrayList<Integer>(Arrays.asList(a));

		System.out.print("\n Filter 7 from numbers 0123456789: ");
		mutableNumbers.stream()
			.filter(n -> n == 7)
			.forEach(System.out::print);
		System.out.println();
	}

	//Use Lambda as in-line implementation of a Functional Interface

	@FunctionalInterface
	public interface GreatDivide {
		int divide(int t1, int t2);
	}
	public void simpleLambda() {
		GreatDivide intDivide = (int x, int y) -> x / y;
		System.out.println(intDivide.divide (21, 3));
	}
	
	//Use inner class rAnonymous as implementation of the Java Runnable Interface
	
	void runnableAnonymous() {
	    Runnable rAnonymous = new Runnable() {
	    	@Override
	    	public void run() {
	    		System.out.println("Run rAnonymous, run!");
	    	}
	    };
		Thread t = new Thread(rAnonymous);
		t.start();
	}
	
	//Use Anonymous inner class as implementation of the Java Runnable Interface

	void runnableAnonymous1() {
	    Thread t = new Thread(new Runnable() {
	    	@Override
	    	public void run() {
	    		System.out.println("Run anonymous, run!");
	    	}
	    });
		t.start();
	}
	
	//Example: Anonymous Inner Class
	
		void show() {
			Out anony = new Out() {
				@Override
				void show() {
					System.out.println("this is Anonymous InterClass showing."); 
				}
			};
			anony.show();
		}
		class Out{ 
			void show(){ 
				System.out.println("this is Out showing."); 
			}
		}
		
	//Use Lambda as in-line implementation of the Java Runnable Interface

	void runnableLambda() {
		Runnable r = () -> System.out.println("run");
		Thread t1 = new Thread(r);
		t1.start();
		Thread t2 = new Thread(() -> System.out.println("run"));
		t2.start();
	}

	
	
}
