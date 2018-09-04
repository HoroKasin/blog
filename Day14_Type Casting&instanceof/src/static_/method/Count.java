package static_.method;

public class Count {
	
	public int a; //General method 
	public static int b; //static
	
	//General method 
	public int method1() {
		a = 10;
		return b;
	}
	
	//Static method 
	public static int method2() {
		Count c = new Count();
		c.a = 10;
		return ++b;
	}
}










