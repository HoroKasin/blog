package poly.promotion;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.method1();
		p1.method2();
		System.out.println("----------------");
		
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		
		System.out.println("======polymorphism Application======");
		
		Parent p2 = c1;//promotion Child->Parent
		
		p2.method1();
		p2.method2();
		
		/*
		 * Apply multiple modalities to enable child objects
		 * When you convert your brother, you'll need to identify
		 * Problems encountered with member variables not accessible.
		 * However, overridden methods can be called normally.
		 */
	}

}








