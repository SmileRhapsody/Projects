package edu.neu.csye6200.patterns;


import edu.neu.csye6200.object.Bread;

public class BreadFactory {
	public static Bread getObject(int id, double price, double calories) {
		return new Bread(id, price, calories);
	}
}
