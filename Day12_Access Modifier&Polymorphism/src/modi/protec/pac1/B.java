package modi.protec.pac1;

public class B {
	
	public B() {
		//protected is accessible from the same package
		A a = new A();
		a.var = "bye";
		a.method();
	}
}
