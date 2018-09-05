package inter.toy;

public class TeddyBear implements IMove {

	public TeddyBear() {
		System.out.println("TeddyBear.");
		canMove();
		System.out.println("-----------------------");
	}
	
	@Override
	public void canMove() {
		System.out.println("You can move your arms and legs.");
		
	}
	
}
