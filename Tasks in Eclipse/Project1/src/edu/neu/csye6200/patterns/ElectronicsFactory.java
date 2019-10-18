package edu.neu.csye6200.patterns;

import edu.neu.csye6200.object.Electronics;

public class ElectronicsFactory {
	public static Electronics getObject(int id, double price) {
		return new Electronics(id, price);
	}
}
