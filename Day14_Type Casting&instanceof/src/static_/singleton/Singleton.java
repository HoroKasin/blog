package static_.singleton;

public class Singleton {
	
	private int i;
	
	public void setI(int i) {
		this.i = i;
	}
	public int getI() {
		return i;
	}
	
	private Singleton() {
		
	}
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
}




