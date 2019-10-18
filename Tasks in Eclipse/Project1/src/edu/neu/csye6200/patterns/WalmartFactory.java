package edu.neu.csye6200.patterns;

import edu.neu.csye6200.object.Walmart;

public class WalmartFactory {
	public static Walmart getObject(int id, String s) {
		return new Walmart(id, s);
	}
}