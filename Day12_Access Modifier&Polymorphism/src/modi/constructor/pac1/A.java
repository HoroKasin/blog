package modi.constructor.pac1;

public class A {
	
	//Member variable declaration
	A a1 = new A(true);	
	A a2 = new A(33);
	A a3 = new A("hello");
	
	
	public A(boolean b) {} //Restrict public
	
	A(int i) {}			   //limit p.f
	
	private A(String s) {} //private restriction
	
}
