package neu.csye6200.patterns;

import neu.csye6200.API.AbstractItemAPI;
import neu.csye6200.factory.AbstractItemFactory;

public class TVFactory extends AbstractItemFactory{

	@Override
	public AbstractItemAPI getItem() {
		return new TV();
	}

	public TV getItem(String name, double price, int available, int size) {
		return new TV(name, price, available,size);
	}

}
