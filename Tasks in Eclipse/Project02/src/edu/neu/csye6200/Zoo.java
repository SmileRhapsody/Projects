package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	public static void demo() {
		Animal a= new Animal();
		Dog d= new Dog();
		Cat c = new Cat();
		
		//Demonstrate Dynamic Polymorphism
		/**
		 * List of animals in Zoo
		 */
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(a);
		animals.add(d);
		animals.add(c);
		
		/**
		 * show animals in Zoo
		 */
		System.out.println(animals.size() + " animals in this zoo");
		a.speak();
		d.speak();
		for (Animal animal : animals) {
			animal.speak();	//animal speak POLYMORPHICALLY
		}
	}
}
