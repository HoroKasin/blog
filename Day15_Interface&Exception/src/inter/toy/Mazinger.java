package inter.toy;

public class Mazinger implements IMissile, IMove {
	
	public Mazinger() {
		System.out.println("Mazinger robot.");
		canMove();
		canMissile();
		System.out.println("-----------------------");
	}
	
	@Override
	public void canMove() {
		System.out.println("You can move your arms and legs.");
	}

	@Override
	public void canMissile() {
		System.out.println("Can shoot missiles.");
	}

}
