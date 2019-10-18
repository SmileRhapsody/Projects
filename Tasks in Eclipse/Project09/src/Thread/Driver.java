package Thread;

public class Driver {
	public static void main(String[] args) {
	    new MyThread().start(); 
	    new Thread(new MyTask()).start();
	    new MyTask().r();
	}
}
