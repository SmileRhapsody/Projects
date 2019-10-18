package neu.csye6200.patterns;

import neu.csye6200.API.AbstractItemAPI;
import neu.csye6200.factory.AbstractItemFactory;

public class BreadFactory extends AbstractItemFactory{

	@Override
	public AbstractItemAPI getItem() {
		return new Bread();
	}
	
	public AbstractItemAPI getItem(String name, double price, int available, int remainingDay) {
		return new Bread(name, price, available, remainingDay);
	}
	
}
