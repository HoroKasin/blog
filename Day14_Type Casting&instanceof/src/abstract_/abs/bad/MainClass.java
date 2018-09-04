package abstract_.abs.bad;

public class MainClass {

	public static void main(String[] args) {

		Store s = new Store();
		
		s.orderAppel();
		s.orderBanana();
		s.orderMelon(); //There was no override.
		s.orderGrape();
	}

}
