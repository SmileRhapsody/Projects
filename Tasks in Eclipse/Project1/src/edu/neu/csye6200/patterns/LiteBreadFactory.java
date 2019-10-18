package edu.neu.csye6200.patterns;

import edu.neu.csye6200.object.LiteBread;

public class LiteBreadFactory {
	public static LiteBread getObject(int id, double price, double cal) {
		return new LiteBread(id, price, cal);
	}
}
