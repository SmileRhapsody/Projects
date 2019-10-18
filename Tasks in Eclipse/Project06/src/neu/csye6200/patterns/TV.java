package neu.csye6200.patterns;

public class TV extends Item{

	private int size;
	
	public TV() {}
	
	public TV(String name, double price, int available, int size) {
		super(name, price, available);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public void show() {
		System.out.println("it's a TV");
	}

	@Override
	public String toString() {
		return "TV" + super.toString()+" size=" + size + "]";
	}
	
	
}
