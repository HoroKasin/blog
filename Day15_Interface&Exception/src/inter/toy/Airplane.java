package inter.toy;

public class Airplane implements IMissile, ILight {
	
	public Airplane() {
		System.out.println("airplane toy.");
		canLight();
		canMissile();
		System.out.println("-----------------------");
	}
	
	@Override
	public void canLight() {
		System.out.println("I can shoot the light.");
	}

	@Override
	public void canMissile() {
		System.out.println("Can shoot missiles.");
	}

}
