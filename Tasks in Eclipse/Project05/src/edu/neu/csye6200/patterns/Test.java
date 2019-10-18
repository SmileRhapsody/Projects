package edu.neu.csye6200.patterns;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.api.AbstractExplosionFactoryAPI;
import edu.neu.csye6200.api.Explosion;

public class Test {
	private int explosionCount = 0;
	private List<Explosion> explosions = new ArrayList<>();
	private List<AbstractExplosionFactoryAPI> factories = new ArrayList<>();
	
	public Test() {
		
	}
	public Test(int n) {
		factories.add(new ABombFactory());
		factories.add(new GrenadeFactory());
		factories.add(new GunShotFactory());
		for(int i = 0; i < n ; i++) {
			for(AbstractExplosionFactoryAPI f : factories) {
				explosions.add(f.getObject());
			}
		}
	}
	
	public void start() {
		System.out.println(explosions.size() + " explosions to set off.");
		for (Explosion e : explosions) {
			System.out.print(e.getClass().getSimpleName() + " ");
			e.explode();
		}
	}

	public static void demo() {
		Test t = new Test(2);
		t.start();
	}
}
