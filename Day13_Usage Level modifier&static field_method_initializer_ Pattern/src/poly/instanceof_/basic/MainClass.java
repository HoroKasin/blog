package poly.instanceof_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p1 = new Child();
		
		//deliver a child instance as a medium
		method1(p1);
		method2(p1);
		
		Parent p2 = new Parent();
		
		//deliver a parent instance as a medium
		method1(p2);
		method2(p2);
	}
	
	public static void method1(Parent p) {
		if(p instanceof Child) {
			Child c = (Child)p;
			System.out.println("method1 - Conversion to Child Type succeeded!");
		}else {
			System.out.println("method1 - Conversion to ChildType failed!");
		}
	}
	
	public static void method2(Parent p) {
		Child c = (Child)p;
		System.out.println("method2 - Conversion to ChildType failed!");
	}

}







