package final_.method;

public class Child extends Parent {
	
	public Child() {
		Parent p = new Parent();
		
		p.method1();
		p.method2();
		p.method3();
	}
	
	public void method1() {}
	public void method2() {}
//	public void method3() {}//Final method cannot be overriding
	
}






