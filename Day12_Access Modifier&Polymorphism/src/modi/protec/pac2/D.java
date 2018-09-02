package modi.protec.pac2;

import modi.protec.pac1.A;

public class D extends A {
	
	public D() {
		
//		A a = new A();
//		a.var1 = "hi";
//		a.method();
		/*
		 Protected restrictors have different packages
		 * If there is an inheritance between two classes
		 * Allow reference via super.
		 */
		super();
		super.var = "hi";
		super.method();
	}
}










