package abstract_.abs.good;

public abstract class HeadStore {
	
	public abstract void orderApple();
	public abstract void orderBanana();
	public abstract void orderGrape();
	public abstract void orderMelon();
	
	public final void orderPeach() {
		System.out.println("The price of peach juice is 2,400 won.");
	}
	
	public void orderWaterMelon() {
		System.out.println("Watermelon juice costs 4,000 won.");
	}
	
}






