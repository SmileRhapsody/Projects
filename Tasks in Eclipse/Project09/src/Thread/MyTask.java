package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyTask implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello from thread!"); 
	}

	public void r() {
		ExecutorService executor = Executors.newFixedThreadPool( 10 );
		executor.execute(() -> System.out.println("Execute lambda, execute!"));
	}
}
