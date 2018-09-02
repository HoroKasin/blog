package super_.airplane;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp sa = new SuperSonicAp();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonicAp.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonicAp.NORMAL;
		sa.fly();
		sa.land();

	}

}





