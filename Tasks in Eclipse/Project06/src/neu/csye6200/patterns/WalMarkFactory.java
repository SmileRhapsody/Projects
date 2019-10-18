package neu.csye6200.patterns;

import neu.csye6200.factory.AbstractStoreFactory;

public class WalMarkFactory extends AbstractStoreFactory{

	@Override
	public WalMark getStore() {
		return new WalMark();
	}
	
	public WalMark getStore(String name, String location, int size) {
		return new WalMark(name, location, size);
	}
}
