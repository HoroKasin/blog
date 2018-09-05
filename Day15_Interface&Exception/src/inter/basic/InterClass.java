package inter.basic;

/*
 * 1. The keywords that implement the interface are applications.
 * 2. Interfaces differ from inheritance to multiple interfaces simultaneously
 * Multiple implementations.
 * 3. The interface is
 * Abstract messages must be redefined.
 */

public class InterClass implements Inter1, Inter2 {

	@Override
	public void method2() {
		System.out.println("Inter2 interface method call");
	}

	@Override
	public void method1() {
		System.out.println("Inter1 interface method call");
	}
	
	public void method3() {
		System.out.println("InterClass call by calss method");
	}

}






