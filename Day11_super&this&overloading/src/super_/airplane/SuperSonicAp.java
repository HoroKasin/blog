package super_.airplane;

public class SuperSonicAp extends Airplane {
	
	//When specifying constants, 
	//attach static final before data type
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;

	@Override
	void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("Fly in supersonic mode.");
		}else {
			super.fly();
		}
	}
	
	
}








