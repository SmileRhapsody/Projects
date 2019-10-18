package Quiz5;

abstract class Animal {
	protected boolean isMammal;
	protected boolean isCanivorous;
	
//	public Animal() {}
	
	public Animal (boolean isMammal, boolean isCanivorous) {
		this.isMammal = isMammal;
		this.isCanivorous = isCanivorous;
	}
	
	public boolean getIsMammal() {
		return this.isMammal;
	}
	
	public boolean getIsCarnivorous() {
		return this.isCanivorous;
	}
	
	abstract public String getGreeting();
	
	public void printAnimal(String name) {
		System.out.println(
				"A " + name + " says '" + this.getGreeting()
				+ "', is " + (this.getIsCarnivorous() ? "" : "not ")
				+ "carnivorous, and is "+ (this.getIsMammal() ? "" : "not ") + "a mammal");
	}
}
