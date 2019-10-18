package neu.csye6200.patterns;

public class Bread extends Item{
	private int remainingDay;
	
	public Bread() {}
	
	public Bread(String name, double price, int available, int remainingDay) {
		super(name, price, available);
		this.remainingDay = remainingDay;
	}

	public int getRemainingDay() {
		return remainingDay;
	}

	public void setRemainingDay(int remainingDay) {
		this.remainingDay = remainingDay;
	}
	
	@Override
	public void show() {
		System.out.println("it's a bread");
	}
}
