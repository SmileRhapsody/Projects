package Quiz5;

public class Dog extends Animal{

	public Dog() {
		super(true, true);
//		super.isMammal = true;
//		super.isCanivorous = true;
	}
	
	public Dog (boolean isMammal, boolean isCanivorous) {
		super(isMammal,isCanivorous);
	}
	
	@Override
	public String getGreeting() {
		return "ruff";
	}
	
}
