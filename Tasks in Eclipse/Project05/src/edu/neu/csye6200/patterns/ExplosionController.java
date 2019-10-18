package edu.neu.csye6200.patterns;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.api.AbstractExplosionFactoryAPI;
import edu.neu.csye6200.api.Explosion;
/**
 * ExplosionController
 * Employ Factory Design pattern
 * 
 * @author danielgmp
 *
 */
public class ExplosionController {
	private int explosionCount = 0;
	private List<Explosion> explosions = new ArrayList<>();
	private List<AbstractExplosionFactoryAPI> factories = new ArrayList<>();
	
	/**
	 * default constructor demonstrates loose coupling in
	 * this class
	 * 	a. Never references classes derived from AbstractExplosionFactory.
	 * 	a. Never references classes derived from Explosion. 
	 */
	public ExplosionController() {
	}
	
	/*
	 * Class constructor for default demonstration usigng
	 * small set of Explosion factories 
	 */
	public ExplosionController(int explosionCount) {
		this.explosionCount = explosionCount;
		this.load(new GunShotFactory());
		this.load(new GrenadeFactory());
		this.load(new ABombFactory());
		System.out.println(this.factories.size() + " factories Added.");
		this.load();
	}
	
	public void load(AbstractExplosionFactoryAPI f) {
		factories.add(f);
	}
	
	
	private void load() {
		this.add(this.explosionCount);
	}
	public void load(int n) {
		if (0 == n) {
			this.explosions.clear();
			this.explosionCount = n;
		} else {			
			this.add(n);
		}
	}	
	private void add(int n) {
		System.out.println( "Adding " + n * this.factories.size() + " explosions (" + n + " each of " + this.factories.size() + " different types).");
		for (int i = 0; i < n; i++) {
			for (AbstractExplosionFactoryAPI f : this.factories) {
				this.explosions.add(f.getObject());
				this.explosionCount++;
			}
		}
	}
	
	public void load(Explosion e) {
		this.explosions.add(e);
		this.explosionCount++;
	}
	
	public void start() {
		System.out.println(explosions.size() + " explosions to set off.");
		for (Explosion e : explosions) {
			System.out.print(e.getClass().getSimpleName() + " ");
			e.explode();
		}
	}
	public static void demo() {
		System.out.println("\t" + ExplosionController.class.getName() + " .demo() starting...\n");
		ExplosionController obj = new ExplosionController(2);	// use small set of factories	
		/*
		 * usng Factor Pattern
		 */
		obj.start();
		
//		obj.load(new GunShot());
//		obj.load(new Grenade());
//		obj.load(new ABomb());
//		obj.start();
		System.out.println(ExplosionController.class.getName() + " .demo() done!\n");
	}
	public static void demo2() {
		System.out.println("\t" + ExplosionController.class.getName() + " .demo() starting...\n");
		ExplosionController obj = new ExplosionController();	// empty		
		/*
		 * Explosion Controller uses Factory Pattern
		 * Load Explosion Factories (AbstractExplosionFactory)
		 */
		obj.load(new GunShotFactory());
		obj.load(new GrenadeFactory());
		obj.load(new ABombFactory());
		/*
		 * Use loaded factories to create Explosions
		 */
		obj.load(2);		// creating two explosions from each factory
		obj.start();
		
		System.out.println(ExplosionController.class.getName() + " .demo() done!\n");
	}
	/**
	 * Factory Assignment:
	 * 
	 * Factory Pattern Assignment 100 total points

20 points: 
Create and submit your entire project solution on time in an eclipse workspace, for example (for eclipse Oxygen, i.e. ‘o2’):

workspace-dan-peters-o2-java-factory

including ONLY one project named Project1 in your eclipse workspace and ONLY one main method in the class named Driver. You will zip (e.g. 7-zip) this entire workspace (file named FOR EXAMPLE: workspace-dan-peters-o2-java1.zip and submit BEFORE DUE DATE (uploaded to BlackBoard.)

—

Factory Pattern Assignment: PART I 40 TOTAL POINTS distributed as follows:

Create an AbstractPersonAPI abstract class.
Derive a Person class from AbstractPersonPI.
Derive a Student class and an Employee class both from the Person class.

—

15 POINTS: 
Create and use a Person factory to create the targeted derived objects (Student and Employee). 
For PART I, Use the Simple Factory Design Pattern, i.e. one factory class creates all target objects. 
(NOTE: For PART II you will refactor your code to use the more advanced Factory Design Pattern,
 i.e. one derived factory class for each target object.)

Use the Person factory to create AT LEAST THREE Student objects and AT LEAST THREE Employee objects.
—

10 POINTS: 
Create one or more control classes.
DO NOT PUT ALL YOUR CODE IN THE MAIN METHOD.

The main method should only call your static demo in a controlling class (or controlling classes) of your design, for example:
	Company.demo();
	School.demo();
—

10 POINTS: 
Create useful methods in control class.
DO NOT PUT ALL YOUR CODE IN DEMO METHOD of controlling class. 

Your controlling class demo method should demonstrate the use of one or more objects instantiated from your controlling class (i.e. show object state).

—

5 POINTS: 
Copy ALL console output and paste AS A COMMENT into the main method (at the end).

-

Factory Pattern Assignment: PART II 40 total points distributed as follows:

Repeat the Factory Pattern Assignment (implement in demo2) but

Use the more GoF Factory Design Pattern,
 (i.e. one derived factory class for each target object.)

DO NOT PUT ALL YOUR CODE IN THE MAIN METHOD.

The main method should only call your static demo2 in a controlling class (or controlling classes) of your design, for example:
	Company.demo2();
	School.demo2();
—

 */
}
